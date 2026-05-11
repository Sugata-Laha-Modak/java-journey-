public class Day24 {
    // Stack in java part 1
    class Stack {
        int maxSize;
        int[] stackArray;
        int top;
        Stack(int size) {
            this.maxSize = size;
            this.stackArray = new int[maxSize];
            this.top = -1;
        }
        void push(int value) {
            if (top < maxSize - 1) {
                top++;
                stackArray[top] = value;
            } else {
                System.out.println("Stack is full");
            }
        }
        int pop() {
            if (top >= 0) {
                int value = stackArray[top];
                top--;
                return value;
            } else {
                System.out.println("Stack is empty");
                return -1; // Return -1 to indicate stack is empty
            }
        }
        boolean isEmpty() {
            return (top == -1);
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.pop()); // Output: 20
        System.out.println(stack.isEmpty()); // Output: false
    }
     // Stack in java part 2 - Stack using Linked List
    class StackUsingLinkedList {
        Node top;
        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }
        int pop() {
            if (top != null) {
                int value = top.data;
                top = top.next;
                return value;
            } else {
                System.out.println("Stack is empty");
                return -1; // Return -1 to indicate stack is empty
            }
        }
        boolean isEmpty() {
            return (top == null);
        }
        // Notes for stack - A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. It allows for adding and removing elements in a specific order, where the last element added is the first one to be removed. Stacks can be implemented using arrays or linked lists, and they are commonly used in various applications such as function calls, expression evaluation, and backtracking algorithms.
    }
}
