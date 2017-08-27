package in.ua.denoming.juja.shared;

public interface Array<T extends Comparable<T>> {
    int size();
    void swap(int index1, int index2);
    Element<T> get(int index);
    T set(int index, T value);
    Element<T> set(int index, Element<T> value);
    int compare(int index1, int index2);
    void copy(int fromIndex, int toIndex);
}
