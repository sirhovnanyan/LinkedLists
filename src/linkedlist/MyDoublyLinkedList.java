package linkedlist;

import java.util.NoSuchElementException;

public class MyDoublyLinkedList<T> implements MyList<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    @Override
    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException();
        }
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public void add(T obj) {
        Node<T> node = new Node(obj);
        if (first == null) {
            first = node;
            last = node;
            size++;
            return;
        }
        node.previous = last;
        last.next = node;
        last = node;
        size++;
    }

    @Override
    public void remove(int index) {
        T value = get(index);
        remove(value);
    }

    @Override
    public boolean remove(T obj) {
        if (first.value.equals(obj)) {
            first.next.previous = null;
            first = first.next;
            size--;
            return true;
        }
        Node<T> current = first;
        for (int i = 0; i < size() - 1; i++) {
            if (current.next.value.equals(obj)) {
                if (i == size - 2) {
                    current.next = null;
                    last = current;
                } else {
                    current.next.next.previous = current.next.previous;
                    current.next = current.next.next;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T obj) {
        Node<T> current = first;
        while (current != null) {
            if (current.value == obj)
                return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node<T> returnedItem;
        private Node<T> next = first;
        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor != size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            returnedItem = next;
            next = next.next;
            cursor++;
            return returnedItem.value;
        }
    }

    private class Node<T> {
        private T value;
        private Node previous;
        private Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        MyDoublyLinkedList.Node current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.value);
            if (i < size - 1) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}
