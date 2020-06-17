public class Tester {

//    @AfterSuite
//    public void afterTestErr(){
//        System.out.println("Err After test");
//    }

    @Test (3)
    public void test3(){
        System.out.println("Test 3");
    }

    @Test (3)
    public void test4(){
        System.out.println("Test 4(3)");
    }

    @Test (10)
    public void test10(){
        System.out.println("Test 10");
    }

    @AfterSuite
    public void afterTest(){
        System.out.println("After test");
    }

    @BeforeSuite
    public void beforeTest(){
        System.out.println("Before test");
    }

    @Test(1)
    public void test1(){
        System.out.println("Test 1");
    }

    @Test(2)
    public void test2(){
        System.out.println("Test 2");
    }



}
