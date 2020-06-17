package lesson_01.task3;

public class Main {

    public static void main(String[] args) {
        Box<Orange> boxOrange = new Box(new Orange());
        for (int i = 0; i < 9; i++) {
            boxOrange.addFruit(new Orange());
        }
        System.out.println("box1.weight = " + boxOrange.getWeight());
        //boxOrange.addFruit(new Apple());

        Box<Apple> boxApple = new Box(new Apple());
        while (!boxOrange.compare(boxApple))
            boxApple.addFruit(new Apple());
        System.out.println("box1 = box2 " +  boxApple.compare(boxOrange));
        //boxApple.addFruit(new Orange()); //даст ошибку

        System.out.println("before replace");
        System.out.println("boxOrange.weight = " + boxOrange.getWeight());
        System.out.println("boxApple.weight " + boxApple.getWeight());

        //boxOrange.replaceFruits(boxApple); //даст ошибку
        Box<Orange> newBoxOrange = new Box(new Orange());
        for (int i = 0; i < 15; i++) {
            newBoxOrange.addFruit(new Orange());
        }

        System.out.println("after replace");
        System.out.println("boxOrange.weight = " + boxOrange.replaceFruits(newBoxOrange).getWeight());
        System.out.println("box2.weight = " + boxApple.getWeight());
        System.out.println("box2.weight = " + newBoxOrange.getWeight());

    }
}
