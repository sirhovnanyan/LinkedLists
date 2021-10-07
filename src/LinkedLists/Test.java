package LinkedLists;

public class Test {
    public static void main(String[] args) {
        MySinglyLinkedList singlyLinkedList = new MySinglyLinkedList();
        singlyLinkedList.add(78);
        singlyLinkedList.add(94);
        singlyLinkedList.add(123);
        singlyLinkedList.add(37);
        singlyLinkedList.add(49);

        System.out.println(singlyLinkedList.get(3));
        System.out.println(singlyLinkedList.contains(49));
        singlyLinkedList.remove(3);
        singlyLinkedList.remove((Integer) 123);
        System.out.println(singlyLinkedList.size());

        System.out.println("My Singly Linked List: " + singlyLinkedList.toString());


        MyDoublyLinkedList doublyLinkedList = new MyDoublyLinkedList();

        doublyLinkedList.add(45);
        doublyLinkedList.add(46);
        doublyLinkedList.add(47);
        doublyLinkedList.add(48);
        doublyLinkedList.add(49);
        doublyLinkedList.remove((Integer) 47);
        System.out.println(doublyLinkedList.get(3));
        System.out.println(doublyLinkedList.contains(46));
        doublyLinkedList.remove(3);
        System.out.println("My Doubly Linked List: " + doublyLinkedList.toString());
    }
}
