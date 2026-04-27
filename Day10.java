public class Day10 {
    // String - Arrauy of characters
    // String name = "Sugata";
    // String city = "Beliatore";
    // length()-
    public static void main(String[] args) {
         String name = "Sugata";
         int length = name.length();
         System.out.println("Length of the string: " + length);
       // charAt() - to get the character at a specific index
         char firstChar = name.charAt(0);
         System.out.println("First character: " + firstChar);
       // substring() - to get a part of the string
         String subString = name.substring(0, 3);
         System.out.println("Substring: " + subString);
       // toUpperCase() - to convert the string to uppercase
         String upperCaseName = name.toUpperCase();
         System.out.println("Uppercase: " + upperCaseName);
       // toLowerCase() - to convert the string to lowercase
         String lowerCaseName = name.toLowerCase();
         System.out.println("Lowercase: " + lowerCaseName);
         // indexOf() - to find the index of a specific character or substring
         int index = name.indexOf('g');
         System.out.println("Index of 'g': " + index);  
         // replace() - to replace a specific character or substring with another   
         String replacedName = name.replace('a', 'o');
         System.out.println("Replaced Name: " + replacedName);
       // Reverse a string
         String reversedName = new StringBuilder(name).reverse().toString();
         System.out.println("Reversed Name: " + reversedName);
       // == operator vs equals() method
         String name1 = "Sugata";
         String name2 = "Sugata";
         System.out.println("Using == operator: " + (name1 == name2)); // true, because string literals are interned
         System.out.println("Using equals() method: " + name1.equals(name2)); // true, because the content is the same          
    }
   
    
}
