package linkedlist;

public class Test {
    public static void main(String[] args) {
        MySinglyLinkedList singlyLinkedList = new MySinglyLinkedList();
        singlyLinkedList.add(78);
        singlyLinkedList.add(94);
        singlyLinkedList.add(123);
        singlyLinkedList.add(37);
        singlyLinkedList.add(49);

        System.out.println(singlyLinkedList.get(4));
        System.out.println(singlyLinkedList.contains(49));
        singlyLinkedList.remove(3);
        singlyLinkedList.remove((Integer) 123);
        System.out.println(singlyLinkedList.size());

        System.out.println("My Singly Linked List: " + singlyLinkedList.toString());
        System.out.print("Iterating my singly linked list using Iterator: ");
        MyList.Iterator itr = singlyLinkedList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        MyDoublyLinkedList doublyLinkedList = new MyDoublyLinkedList();

        doublyLinkedList.add(45);
        doublyLinkedList.add(46);
        doublyLinkedList.add(47);
        doublyLinkedList.add(48);
        doublyLinkedList.add(49);
        doublyLinkedList.remove((Integer) 47);
        System.out.println("\n"+doublyLinkedList.get(2));
        System.out.println(doublyLinkedList.contains(46));
        doublyLinkedList.remove(3);

        System.out.println("My Doubly Linked List: " + doublyLinkedList.toString());
        System.out.print("Iterating my doubly linked list using Iterator: ");
        MyList.Iterator it = doublyLinkedList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
