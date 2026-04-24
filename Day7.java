import java.util.*;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 15, 20, 35, 40, 50 };
        System.out.println("Enter a number to search: ");
        int num = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(num + " is found in the array.");
        } else {
            System.out.println(num + " is not found in the array.");
        }
        System.out.println("What is your name? ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("First letter: " + name.charAt(0));
        sc.close();

    }
}