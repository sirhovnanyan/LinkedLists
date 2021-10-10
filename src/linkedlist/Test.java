package linkedlist;

public class Test {
    public static void main(String[] args) {

        MyDoublyLinkedList<Integer> doublyLinkedList = new MyDoublyLinkedList<Integer>();

        for (int i = 1; i < 6; i++) {
            doublyLinkedList.add(i);
        }

        doublyLinkedList.addFirst(0);
        doublyLinkedList.addLast(6);
        doublyLinkedList.removeFirst();

        System.out.print("Iterating my doubly linked list using Iterator: ");
        MyList.ListIterator<Integer> it = doublyLinkedList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        MyList.Iterator<Integer> itr = doublyLinkedList.descendingIterator();
        System.out.print("\nIterating my doubly linked list from the end։ ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
