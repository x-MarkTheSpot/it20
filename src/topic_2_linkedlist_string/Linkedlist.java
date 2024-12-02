
package topic_2_linkedlist_string;

public class Linkedlist {
    private Node head;

    // Method to add a new node at the end of the list
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void deleteByValue(String value) {
        if (head == null) return;

        // If the head needs to be removed
        if (head.data.equals(value)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Method to move a node to a new position / swap nodes
    public void moveNodePointer(String value1, String value2) {
        if (head == null || value1.equals(value2)) return;

        Node prev1 = null, node1 = null, current = head;
        Node prev2 = null, node2 = null;

        // Find the first node (node1) with value1
        while (current != null && node1 == null) {
            if (current.data.equals(value1)) {
                node1 = current;
            } else {
                prev1 = current;
            }
            current = current.next;
        }

        // Find the second node (node2) with value2
        current = head;
        while (current != null && node2 == null) {
            if (current.data.equals(value2)) {
                node2 = current;
            } else {
                prev2 = current;
            }
            current = current.next;
        }

        // If both nodes are found, swap them
        if (node1 != null && node2 != null) {
            if (prev1 != null) {
                prev1.next = node2;
            } else {
                head = node2; // If node1 is the head
            }

            if (prev2 != null) {
                prev2.next = node1;
            } else {
                head = node1; // If node2 is the head
            }

            // Swap next pointers
            Node temp = node1.next;
            node1.next = node2.next;
            node2.next = temp;
        }
    }

    // Node class
    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
}