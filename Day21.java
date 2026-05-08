public class Day21 {
    // Interface provides a contract for classes to implement specific behavior
    interface Printable {
        void print();
    }
    // Class that implements the Printable interface
    static class Document implements Printable {
        public void print() {
            System.out.println("Printing the document...");
        }
    }
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print(); // Output: Printing the document...
    }
    // Interfaces can also be used to achieve multiple inheritance in Java
    interface Readable {
        void read();
    }
    static class Book implements Readable, Printable {
        public void read() {
            System.out.println("Reading the book...");
        }
        public void print() {
            System.out.println("Printing the book...");
        }
    }
    public static void main(String[] args) {
        Book book = new Book();
        book.read(); // Output: Reading the book...
        book.print(); // Output: Printing the book...
    }
    


     
}
