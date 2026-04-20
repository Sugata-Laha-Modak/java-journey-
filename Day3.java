/* This program takes marks as input and prints the corresponding grade based on the following criteria:
*/ 
import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        System.out.println("Enter your marks");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
         scanner.close();
    }
}