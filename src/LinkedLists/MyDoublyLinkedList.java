package LinkedLists;

public class MyDoublyLinkedList implements MyList {

    int size;
    Node first;
    Node last;

    @Override
    public Integer get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException();
        }
        MyDoublyLinkedList.Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public void add(Integer obj) {
        Node node = new Node(obj);
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
        Integer value = get(index);
        remove(value);
    }

    @Override
    public boolean remove(Integer obj) {
        if (first.value.equals(obj)) {
            first.next.previous = null;
            first = first.next;
            size--;
            return true;
        }
        Node current = first;
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
    public boolean contains(Integer obj) {
        MyDoublyLinkedList.Node current = first;
        while (current != null) {
            if (current.value == obj)
                return true;
            current = current.next;
        }
        return false;
    }

    class Node {
        Integer value;

        Node previous;
        Node next;

        public Node(Integer value) {
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
