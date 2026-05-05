public class Day18 {
    // StringBuilder part 1
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");
        System.out.println(sb.toString()); // Output: Hello World!

        // Insert a string at a specific index
        sb.insert(5, ",");
        System.out.println(sb.toString()); // Output: Hello, World!

        // Replace a portion of the string
        sb.replace(7, 12, "Java");
        System.out.println(sb.toString()); // Output: Hello, Java!

        // Delete a portion of the string
        sb.delete(5, 6);
        System.out.println(sb.toString()); // Output: Hello Java!
    }
     // more StringBuilder examples
    public static void stringBuilderExamples() {
        StringBuilder sb = new StringBuilder("StringBuilder");
        // Reverse the string
        sb.reverse();
        System.out.println(sb.toString()); // Output: redliuBgnirtS

        // Set a character at a specific index
        sb.setCharAt(0, 's');
        System.out.println(sb.toString()); // Output: sredliuBgnirtS

        // Get the length of the string
        System.out.println(sb.length()); // Output: 13

        // Clear the StringBuilder
        sb.setLength(0);
        System.out.println(sb.toString()); // Output: (empty string)
    }
     // ArrayList part 1
    public static void arrayListExamples() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println(list.get(0)); // Output: Apple
        System.out.println(list.get(1)); // Output: Banana
        System.out.println(list.get(2)); // Output: Cherry

        // Check if an element exists
        System.out.println(list.contains("Banana")); // Output: true
        System.out.println(list.contains("Date"));   // Output: false

        // Remove an element
        list.remove("Banana");
        System.out.println(list.contains("Banana")); // Output: false
    }
        // more ArrayList examples  
    public static void arrayListMoreExamples() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        // Iterate through the list
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i)); // Output: 10, 20, 30
        }
        // Sort the list
        Collections.sort(numbers);
        System.out.println(numbers); // Output: [10, 20, 30]
        // Clear the list
        numbers.clear();
        System.out.println(numbers); // Output: []
        
}
