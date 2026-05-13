public class Day26 {
    // Queue Basics
    static class Queue {
        int front, rear, capacity;
        int queue[];
        Queue(int capacity) {
            this.capacity = capacity;
            this.front = this.rear = 0;
            this.queue = new int[this.capacity];
        }
        void enqueue(int item) {
            if (capacity == rear) {
                System.out.println("Queue is full");
                return;
            }
            queue[rear] = item;
            rear++;
        }
        int dequeue() {
            if (front == rear) {
                System.out.println("Queue is empty");
                return -1; // Return -1 to indicate queue is empty
            }
            int item = queue[front];
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
            return item;
        }
        boolean isEmpty() {
            return (front == rear);
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue()); // Output: 10
        System.out.println(queue.dequeue()); // Output: 20
        System.out.println(queue.isEmpty()); // Output: false
    }
    // Notes : This implementation of a queue uses an array to store the elements. The enqueue method adds an element to the rear of the queue, while the dequeue method removes and returns the front element. The isEmpty method checks if the front and rear indices are equal to determine if the queue is empty. If the queue is full, the enqueue method prints a message indicating that the queue is full. If the queue is empty, the dequeue method prints a message indicating that the queue is empty and returns -1.
        // Queue definition : A queue is a linear data structure that follows the First In, First Out (FIFO) principle. It allows for adding and removing elements in a specific order, where the first element added is the first one to be removed. Queues can be implemented using arrays or linked lists, and they typically support operations such as enqueue (to add an element), dequeue (to remove the front element), and isEmpty (to check if the queue is empty).
                
}
