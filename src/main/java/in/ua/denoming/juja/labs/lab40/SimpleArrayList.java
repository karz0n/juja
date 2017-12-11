package in.ua.denoming.juja.labs.lab40;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleArrayList<E> implements SimpleList<E> {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private E[] data;
    private int size = 0;

    private class SimpleArrayListIterator implements Iterator<E> {
        int last = -1;

        @Override
        public boolean hasNext() {
            int size = size();
            return (size > 0) && (last < size - 1);
        }

        @Override
        public E next() {
            if (hasNext()) {
                return get(++last);
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            if (last == -1) {
                throw new IllegalStateException();
            }
            SimpleArrayList.this.remove(last);
        }
    }

    public SimpleArrayList() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public SimpleArrayList(int initialCapacity) {
        this.data = (E[]) new Object[initialCapacity];
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject == null || otherObject.getClass() != this.getClass())
            return false;
        SimpleArrayList other = (SimpleArrayList) otherObject;
        return Arrays.equals(data, other.data);
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size - 1; i++) {
            builder
                .append(data[i])
                .append(", ");
        }
        builder
            .append(data[size - 1])
            .append("]");

        return builder.toString();
    }

    @Override
    public boolean add(E newElement) {
        ensureCapacity(size + 1);
        data[size] = newElement;
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return data[index];
    }

    @Override
    public Iterator<E> iterator() {
        return new SimpleArrayListIterator();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        E oldValue = data[index];
        int numMoved = size - index - 1;
        System.arraycopy(data, index + 1, data, index, numMoved);
        data[--size] = null;
        return oldValue;
    }

    private void rangeCheck(int index) {
        if (index < 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = Math.max(minCapacity, data.length + (data.length >> 1));
            E[] newData = (E[]) new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            this.data = newData;
        }
    }
}
