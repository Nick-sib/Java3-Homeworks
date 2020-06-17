package lesson_01.task1;

import java.util.Arrays;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public void swap(int oldPos, int newPos) throws Exception {
        if (oldPos < 0 || oldPos > array.length ||
                newPos < 0 || newPos > array.length) {
            throw new Exception("Неправильно указаны позиции элементов для замены");
        }
        T temp = array[oldPos];
        array[oldPos] = array[newPos];
        array[newPos] = temp;
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(array) + '}';
    }
}
