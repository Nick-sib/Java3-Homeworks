package lesson_01.task2;

import java.util.ArrayList;
import java.util.Arrays;

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


        arrayToList(iArray);
        arrayToList(dArray);
    }

    private static Double round(double value){
        return (int)(value * 100 ) / 100.0;
    }

    private static <T> ArrayList arrayToList(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }
}
