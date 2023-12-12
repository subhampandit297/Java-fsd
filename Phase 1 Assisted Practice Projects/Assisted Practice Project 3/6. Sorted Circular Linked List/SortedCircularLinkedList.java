package dom;

class SortedCircularLinkedList {
    Node head;

    SortedCircularLinkedList() {
        this.head = null;
    }

    // Method to insert a new element into the sorted circular linked list
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // If the list is empty, make the new node the head and point to itself
            head = newNode;
            newNode.next = head;
        } else if (data <= head.data) {
            // If the new element is smaller or equal to the head, insert at the beginning
            newNode.next = head;
            Node last = getLastNode();
            last.next = newNode;
            head = newNode;
        } else {
            // Traverse the list to find the correct position to insert the new element
            Node current = head;
            while (current.next != head && current.next.data < data) {
                current = current.next;
            }

            // Insert the new element
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Method to display the sorted circular linked list
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Helper method to get the last node in the circular linked list
    private Node getLastNode() {
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        return last;
    }
}

