package in.ua.denoming.juja;

import java.util.Arrays;

/**
 * User: DENIS
 * Data: 18.02.2017
 * Time: 13:31
 */
public class BasicArray<T extends Comparable<T>> implements Array<T> {
    private Element<T>[] elements;

    @SuppressWarnings("unchecked")
    private BasicArray(int size) throws IllegalArgumentException {
        if (size <= 0) {
            throw new IllegalArgumentException("argument 'size' must be greater than 0");
        }

        elements = new Element[size];
    }

    @SuppressWarnings("WeakerAccess")
    public BasicArray(T[] values) {
        this(values.length);
        for (int i = 0; i < values.length; i++) {
            elements[i] = new Element<>(i, values[i]);
        }
    }

    public BasicArray(Element<T>[] values) {
        this(values.length);
        for (int i = 0; i < values.length; i++) {
            elements[i] = new Element<>(values[i]);
        }
    }

    @SuppressWarnings("WeakerAccess")
    public BasicArray(Array<T> other) {
        this(other.size());
        for (int i = 0; i < other.size(); i++) {
            elements[i] = other.get(i);
        }
    }

    public int size() {
        return elements.length;
    }

    public void swap(int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        Element<T> temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }

    public Element<T> get(int index) {
        return new Element<>(elements[index]);
    }

    public T set(int index, T value) {
        T pValue = elements[index].getValue();
        elements[index].setValue(value);
        return pValue;
    }

    public Element<T> set(int index, Element<T> element) {
        Element<T> pElement = elements[index];
        elements[index] = element;
        return pElement;
    }

    public int compareValue(int index1, int index2) {
        return elements[index1].compareTo(elements[index2]);
    }

    public void copyValue(int fromIndex, int toIndex) {
        elements[toIndex] = elements[fromIndex];
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
