package lesson_01.task1;

public class Main {

    private static final int ARRAYLEN = 10;


    public static void main(String[] args) {
        Integer[] iArray = new Integer[ARRAYLEN];
        for (int i = 0; i < ARRAYLEN; i++) {
            iArray[i] = (int) (Math.random() * 100);
        }
        Double[] dArray = new Double[ARRAYLEN];
        for (int i = 0; i < ARRAYLEN; i++) {
            dArray[i] = round( Math.random() * 100);
        }
        //со String полностью аналогично только рандом сложнее

        GenericArray<?> iGen = new GenericArray(iArray);
        GenericArray<?> dGen = new GenericArray(dArray);
        System.out.println("Before swap");
        System.out.println("iArray: " + iGen.toString());
        System.out.println("dArray: " + dGen.toString());
        try {
            iGen.swap(0, ARRAYLEN - 1);
            dGen.swap(0, ARRAYLEN - 1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("After swap");
        System.out.println("iArray: " + iGen.toString());
        System.out.println("dArray: " + dGen.toString());


    }


    private static Double round(double value){
        return (int)(value * 100 ) / 100.0;
    }
}
