package in.ua.denoming.juja.algorithms;

/**
 * User: DENIS
 * Data: 18.02.2017
 * Time: 12:13
 */
public interface Array<T extends Comparable<T>> {
    int size();
    void swap(int index1, int index2);
    Element<T> get(int index);
    T set(int index, T value);
    Element<T> set(int index, Element<T> value);
    int compareValue(int index1, int index2);
    void copyValue(int fromIndex, int toIndex);
}
