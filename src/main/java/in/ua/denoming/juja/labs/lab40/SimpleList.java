package in.ua.denoming.juja.labs.lab40;

import java.util.Iterator;

public interface SimpleList<E> {
    boolean add(E newElement);
    E get(int index);
    Iterator<E> iterator();
    int size();
    boolean isEmpty();
    E remove(int index);
}
