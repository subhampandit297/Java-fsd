package dom;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyList = new DoublyLinkedList();

        doublyList.insert(1);
        doublyList.insert(2);
        doublyList.insert(3);
        doublyList.insert(4);

        System.out.println("Doubly Linked List in Forward Direction:");
        doublyList.traverseForward();

        System.out.println("Doubly Linked List in Backward Direction:");
        doublyList.traverseBackward();
    }
}
