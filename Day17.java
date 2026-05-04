import java.util.HashMap;
public class Day17 {
    // HashMap part 1
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        System.out.println(map.get("Alice")); // Output: 25
        System.out.println(map.get("Bob"));   // Output: 30
        System.out.println(map.get("Charlie")); // Output: 35
        // Check if a key exists
        System.out.println(map.containsKey("Alice")); // Output: true
        System.out.println(map.containsKey("David")); // Output: false
        // Remove a key-value pair
        map.remove("Bob");
        System.out.println(map.get("Bob")); // Output: null
        System.out.println(map.size()); // Output: 2


}
}
