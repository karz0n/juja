package in.ua.denoming.juja.shared;

import java.util.Arrays;

public class BasicArray<T extends Comparable<T>> implements Array<T> {
    private Element<T>[] elements;

    @SuppressWarnings({"unchecked", "WeakerAccess"})
    public BasicArray(int size) throws IllegalArgumentException {
        if (size < 0) {
            throw new IllegalArgumentException("argument 'size' must be greater or equal than 0");
        }

        elements = new Element[size];
        for (int i = 0; i < size; i++) {
            elements[i] = new Element<>(i, null);
        }
    }

    @SuppressWarnings({"unchecked", "WeakerAccess"})
    public BasicArray(T[] values) {
        elements = new Element[values.length];
        for (int i = 0; i < values.length; i++) {
            elements[i] = new Element<>(i, values[i]);
        }
    }

    @SuppressWarnings({"unchecked", "WeakerAccess"})
    public BasicArray(Array<T> other) {
        elements = new Element[other.size()];
        for (int i = 0; i < other.size(); i++) {
            elements[i] = other.get(i);
        }
    }

    public int size() {
        return elements.length;
    }

    @SuppressWarnings("WeakerAccess")
    boolean empty() {
        return this.size() == 0;
    }

    public void swap(int index1, int index2) {
        assert !empty() : "array is empty";

        if (index1 == index2) {
            return;
        }
        Element<T> temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }

    @SuppressWarnings("unchecked")
    public Element<T> get(int index) {
        assert !empty() : "array is empty";

        return new Element(elements[index]);
    }

    public T set(int index, T value) {
        assert !empty() : "array is empty";

        T pValue = elements[index].getValue();
        elements[index].setValue(value);
        return pValue;
    }

    public Element<T> set(int index, Element<T> element) {
        assert !empty() : "array is empty";

        Element<T> pElement = elements[index];
        elements[index] = element;
        return pElement;
    }

    public int compare(int index1, int index2) {
        assert !empty() : "array is empty";

        return elements[index1].compareTo(elements[index2]);
    }

    public void copy(int fromIndex, int toIndex) {
        assert !empty() : "array is empty";

        elements[toIndex] = elements[fromIndex];
    }

    @Override
    public String toString() {
        return empty() ? "[empty]" : Arrays.toString(elements);
    }
}
