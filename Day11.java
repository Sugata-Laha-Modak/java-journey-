public class Day11 {
    // StringBuilder - A mutable sequence of characters
    // StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        System.out.println("StringBuilder content: " + sb.toString());
        // insert() - to insert a string at a specific index
        sb.insert(5, ",");
        System.out.println("After insertion: " + sb.toString());
        // delete() - to delete a part of the string
        sb.delete(5, 6);
        System.out.println("After deletion: " + sb.toString());
        // reverse() - to reverse the string
        sb.reverse();
        System.out.println("Reversed StringBuilder: " + sb.toString());
        // equalsIgnoreCase() - to compare two strings ignoring case
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println("Strings are equal (ignoring case): " + str1.equalsIgnoreCase(str2));
     // palindrome check
        String palindrome = "madam";
        String reversedPalindrome = new StringBuilder(palindrome).reverse().toString();
        if (palindrome.equals(reversedPalindrome)) {
            System.out.println(palindrome + " is a palindrome.");
        } else {
            System.out.println(palindrome + " is not a palindrome.");
        }   
    } 
}
