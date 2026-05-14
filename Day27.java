public class Day27 {
    // Binary Search Tree (BST) Implementation
    static class Node {
        int key;
        Node left, right;
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }   
    static class BinarySearchTree {
        Node root;
        BinarySearchTree() {
            root = null;
        }
        void insert(int key) {
            root = insertRec(root, key);
        }
        Node insertRec(Node root, int key) {
            if (root == null) {
                root = new Node(key);
                return root;
            }
            if (key < root.key)
                root.left = insertRec(root.left, key);
            else if (key > root.key)
                root.right = insertRec(root.right, key);
            return root;
        }
        void inorder() {
            inorderRec(root);
        }
        void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.key + " ");
                inorderRec(root.right);
            }
        }
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        System.out.println("Inorder traversal of the BST:");
        bst.inorder(); // Output: 20 30 40 50 60 70 80
    }
    // Notes : This implementation of a binary search tree (BST) includes a Node class to represent each node in the tree and a BinarySearchTree class to manage the tree structure. The insert method adds a new key to the BST while maintaining the properties of the tree. The inorder method performs an inorder traversal of the tree, which visits the left subtree, the root node, and then the right subtree, resulting in sorted order of keys. The main method demonstrates how to create a BST, insert values, and perform an inorder traversal to display the keys in sorted order.
        // Binary Search Tree definition : A binary search tree is a binary tree data structure that has the following properties:
        // 1. Each node has at most two children, referred to as the left child
        //    and the right child.
        // 2. The left subtree of a node contains only nodes with keys less than the
        //    node's key.
        // 3. The right subtree of a node contains only nodes with keys greater than the
        //    node's key.
        // 4. Both the left and right subtrees must also be binary search trees.
            
}
