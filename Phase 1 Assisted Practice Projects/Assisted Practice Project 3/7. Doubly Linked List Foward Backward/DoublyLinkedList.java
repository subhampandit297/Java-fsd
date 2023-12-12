package dom;

class DoublyLinkedList {
    Node head;

    DoublyLinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the doubly linked list
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
            newNode.prev = current;
        }
    }

    // Method to traverse the doubly linked list in forward direction
    void traverseForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to traverse the doubly linked list in backward direction
    void traverseBackward() {
        Node last = getLastNode();
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }

    // Helper method to get the last node in the doubly linked list
    private Node getLastNode() {
        Node last = head;
        while (last != null && last.next != null) {
            last = last.next;
        }
        return last;
    }
}
