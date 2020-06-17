
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        try {
            start(Tester.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void start(Class classObject) {
        Method[] methods = classObject.getDeclaredMethods();

        Arrays.sort(methods, new Comparator<Method>() {
            public int compare(Method o1, Method o2) {
                //BeforeSuite - обязательно в начало
                if (o1.isAnnotationPresent(BeforeSuite.class) ) return -1;
                if (o2.isAnnotationPresent(BeforeSuite.class) ) return 1;
                //AfterSuite - обязательно в конец
                if (o1.isAnnotationPresent(AfterSuite.class) ) return 1;
                if (o2.isAnnotationPresent(AfterSuite.class) ) return -1;
                //Test - по значению
                Integer ao1 = o1.getAnnotation(Test.class).value();
                Integer ao2 = o2.getAnnotation(Test.class).value();
                return ao1.compareTo(ao2);
            }
        });

        try {
            //проверяем кол-во BeforeSuite AfterSuite
            if (methods.length > 1) {
                //по условию ошибка будет только если BeforeSuite AfterSuite более чем в одном экземпляре
                //если их нет то это не ошибка или я не верно понял
                if (methods[1].isAnnotationPresent(BeforeSuite.class) )
                    throw new TestException("BeforeSuite");
                if (methods[methods.length - 2].isAnnotationPresent(AfterSuite.class))
                    throw new TestException("AfterSuite");

                //Делаем по прядку BeforeSuite - Test1...Test10 - AfterSuite
                for (Method o : methods)
                    System.out.println(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
