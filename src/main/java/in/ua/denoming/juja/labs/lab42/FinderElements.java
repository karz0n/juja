package in.ua.denoming.juja.labs.lab42;

import java.util.Iterator;

public class FinderElements {
    public static Integer findElement(SinglyLinkedList<Integer> singlyLinkedList, int k) {
        if (k < 0) {
            throw new IndexOutOfBoundsException();
        }

        int size = 0;
        Integer item = null;
        Iterator<Integer> I = singlyLinkedList.iterator();
        while (I.hasNext()) {
            item = I.next();
            size++;
        }

        if (k == 0) {
            return item;
        }
        if (k >= size) {
            throw new IndexOutOfBoundsException();
        }

        int diff = size - k;
        I = singlyLinkedList.iterator();
        while (diff-- > 0) {
            item = I.next();
        }
        return item;
    }
}
