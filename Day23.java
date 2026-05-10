public class Day23 {
// Linkedlist part 1 
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    class LinkedList {
        Node head;
        void add(int data) {
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
        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList(); // Output: 10 20 30 
    }
     // Linkedlist part 2 - Insertion and Deletion
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        // Output: 5 10 20 30
        // Notes : Inserting at the beginning of the linked list is done by creating a new node, setting its next pointer to the current head, and then updating the head to point to the new node. This operation has a time complexity of O(1) since it does not require traversing the list.
        // Linkedlist definition : A linked list is a linear data structure where each element (node) contains a data value and a reference (pointer) to the next node in the sequence. It allows for efficient insertion and deletion of elements, as it does not require contiguous memory allocation like arrays. Linked lists can be singly linked (where each node points to the next node) or doubly linked (where each node points to both the next and previous nodes).
        

    }
}
