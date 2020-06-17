package lesson_01.task3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> values = new ArrayList();
    private float weight = 0;

    public Box(T fruit) {
        //obj = fruit;
        addFruit(fruit);
    }

    public Box addFruit(T fruit) {

        //if (obj.getClass() == fruit.getClass()) {
            values.add(fruit);
            weight += fruit.weight;
        //}
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public void Clear(){
        values.clear();
        weight = 0;
    }

    public boolean compare(Box anotherBox) {
        return weight == anotherBox.weight;
    }

    public Box replaceFruits(Box<T> anotherBox) {

        values.addAll(anotherBox.values);
        weight = 0;
        for (int i = 0; i < values.size(); i++) {
            weight += values.get(i).weight;
        }
        //закон сохранения фрукты в другой коробке "кончились"
        anotherBox.Clear();
        return this;
    }


}
