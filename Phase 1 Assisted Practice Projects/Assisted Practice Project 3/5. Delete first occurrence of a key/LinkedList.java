package dom;

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to delete the first occurrence of a key
    void deleteKey(int key) {
        Node current = head;
        Node prev = null;

        // If the key is present at the head
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If the key is not present
        if (current == null) {
            System.out.println("Key not found in the linked list.");
            return;
        }

        // Unlink the node from the linked list
        prev.next = current.next;
    }
}
