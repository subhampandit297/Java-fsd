package dom;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        System.out.println("Original Linked List:");
        linkedList.display();

        int keyToDelete = 3;
        linkedList.deleteKey(keyToDelete);

        System.out.println("Linked List after deleting key " + keyToDelete + ":");
        linkedList.display();
    }
}
