package kolekcje.zadanie1;

import java.util.Arrays;

public class Exercise1 {
}

class SDAArrayList<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elementArray;
    private int size = 0;

    public SDAArrayList() {
        elementArray = new Object[INITIAL_CAPACITY];
    }

    public T get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bound exception. Please provide valid index");
        }
        return (T) elementArray[index];
    }

    public void add (T t) {
        if (size== elementArray.length){
            increaseArraySize();
        }

    }

    private void increaseArraySize() {int newIncreasedCapacity = elementArray.length * 2;
        elementArray = Arrays.copyOf(elementArray,
                newIncreasedCapacity);
    }
}
