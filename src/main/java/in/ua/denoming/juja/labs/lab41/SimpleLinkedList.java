package in.ua.denoming.juja.labs.lab41;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleLinkedList<E> implements SimpleList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    private static class Node<T> {
        private Node<T> prev;
        private T item;
        private Node<T> next;

        private Node(Node<T> prev, T item, Node<T> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }

    private class SimpleLinkedListIterator implements Iterator<E> {
        Node<E> last = null;
        Node<E> current = head;

        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public E next() {
            if (current == null) {
                throw new NoSuchElementException();
            }

            last = current;
            current = current.next;
            return last.item;
        }

        @Override
        public void remove() {
            if (last == null) {
                throw new IllegalStateException();
            }
            unlink(last);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private Node<E> node(int index) {
        if (index < size / 2) {
            Node<E> tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp;
        } else {
            Node<E> x = tail;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }

    private E unlink(Node<E> x) {
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            tail = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    @Override
    public boolean add(E newElement) {
        final Node<E> tmp = tail;
        final Node<E> newNode = new Node<>(tmp, newElement, null);
        tail = newNode;
        if (tmp == null) {
            head = newNode;
        } else {
            tmp.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return node(index).item;
    }

    @Override
    public Iterator<E> iterator() {
        return new SimpleLinkedListIterator();
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
        checkIndex(index);
        return unlink(node(index));
    }

    @Override
    public int hashCode() {
        if (size() == 0) {
            return 0;
        }

        int hash = 0;
        Node<E> p = head;
        do {
            hash += Objects.hashCode(p.item);
            p = p.next;
        } while (p != tail);
        hash += Objects.hashCode(p.item);
        return 31 * hash;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == this)
            return true;
        if (otherObject == null || otherObject.getClass() != this.getClass())
            return false;

        SimpleLinkedList<E> other = (SimpleLinkedList<E>) otherObject;

        if (this.size() != other.size())
            return false;

        Iterator<E> I = this.iterator();
        Iterator<E> otherI = other.iterator();
        while (I.hasNext()) {
            E item = I.next();
            E otherItem = otherI.next();
            if (!item.equals(otherItem)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node<E> p = head;
        do {
            builder.append(p.item).append(", ");
            p = p.next;
        } while (p != tail);
        builder.append(tail.item).append("]");
        return builder.toString();
    }
}
