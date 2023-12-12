package dom;

public class Main {
    public static void main(String[] args) {
        SortedCircularLinkedList circularList = new SortedCircularLinkedList();

        circularList.insert(3);
        circularList.insert(7);
        circularList.insert(10);
        circularList.insert(15);

        System.out.println("Original Sorted Circular Linked List:");
        circularList.display();

        int elementToInsert = 8;
        circularList.insert(elementToInsert);

        System.out.println("Sorted Circular Linked List after inserting " + elementToInsert + ":");
        circularList.display();
    }
}
