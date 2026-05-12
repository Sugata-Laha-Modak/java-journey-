public class Day25 {
    // Stack using Linked List part 3 - Stack using Linked List with size limit
    static class StackUsingLinkedListWithLimit {
        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        Node top;
        int size;
        int maxSize;
        StackUsingLinkedListWithLimit(int maxSize) {
            this.top = null;
            this.size = 0;
            this.maxSize = maxSize;
        }
        void push(int data) {
            if (size < maxSize) {
                Node newNode = new Node(data);
                newNode.next = top;
                top = newNode;
                size++;
            } else {
                System.out.println("Stack is full");
            }
        }
        int pop() {
            if (top != null) {
                int value = top.data;
                top = top.next;
                size--;
                return value;
            } else {
                System.out.println("Stack is empty");
                return -1; // Return -1 to indicate stack is empty
            }
        }
        boolean isEmpty() {
            return (size == 0);
        }
    }
    public static void main(String[] args) {
        StackUsingLinkedListWithLimit stack = new StackUsingLinkedListWithLimit(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // Output: Stack is full
        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.pop()); // Output: 20
        System.out.println(stack.isEmpty()); // Output: false
    }
    // Notes : This implementation of a stack using a linked list includes a size limit. The push method checks if the current size of the stack is less than the maximum size before allowing a new element to be added. If the stack is full, it prints a message indicating that the stack is full. The pop method removes and returns the top element of the stack, and also decrements the size. The isEmpty method checks if the size of the stack is zero to determine if it is empty.
        // Stack definition : A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. It allows for adding and removing elements in a specific order, where the last element added is the first one to be removed. Stacks can be implemented using arrays or linked lists, and they typically support operations such as push (to add an element), pop (to remove the top element), and isEmpty (to check if the stack is empty).
     
}