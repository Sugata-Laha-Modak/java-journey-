public class Day29 {
    // HashMap Implementation
    static class HashMap {
        private class Node {
            String key;
            int value;
            Node next;
            Node(String key, int value) {
                this.key = key;
                this.value = value;
                this.next = null;
            }
        }
        private Node[] buckets;
        private int capacity;
        public HashMap(int capacity) {
            this.capacity = capacity;
            this.buckets = new Node[capacity];
        }
        private int getBucketIndex(String key) {
            return key.hashCode() % capacity;
        }
        public void put(String key, int value) {
            int index = getBucketIndex(key);
            Node head = buckets[index];
            while (head != null) {
                if (head.key.equals(key)) {
                    head.value = value; // Update existing key
                    return;
                }
                head = head.next;
            }
            Node newNode = new Node(key, value);
            newNode.next = buckets[index];
            buckets[index] = newNode; // Insert at the beginning of the bucket
        }
        public Integer get(String key) {
            int index = getBucketIndex(key);
            Node head = buckets[index];
            while (head != null) {
                if (head.key.equals(key)) {
                    return head.value; // Return the value for the key
                }
                head = head.next;
            }
            return null; // Key not found
        }
    } 
    public static void main(String[] args) {
        HashMap hashMap = new HashMap(10);
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("orange", 3);
        System.out.println(hashMap.get("apple")); // Output: 1
        System.out.println(hashMap.get("banana")); // Output: 2
        System.out.println(hashMap.get("grape")); // Output: null (key not found)
    }
    // Notes : This implementation of a HashMap uses separate chaining to handle collisions. Each bucket in the HashMap is a linked list of nodes, where each node contains a key-value pair. The put method adds a new key-value pair to the appropriate bucket based on the hash code of the key, while the get method retrieves the value associated with a given key. If a key already exists in the bucket, its value is updated. If a key is not found, the get method returns null.
        // HashMap definition : A HashMap is a data structure that stores key-value pairs and allows for fast retrieval of values based on their corresponding keys. It uses a hash function to compute an index into an array of buckets, where each bucket can contain multiple entries in case of collisions (when different keys hash to the same index). HashMaps provide constant average time complexity for put and get operations, making them efficient for storing and retrieving data.  
}     

