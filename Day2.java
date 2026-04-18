/* *
public class Day2 {
    public static void main(String[] args) {
       String name = "Sugata Laha Modak";
       int age = 21;
       double cgpa = 8.5;
       boolean isMCAStudent = true;
         System.out.println("Name: " + name);
            System.out.println("Age: " + age);

            System.out.println("CGPA: " + cgpa);
            System.out.println("Is MCA Student: " + isMCAStudent);
    
}
}
*/
import java.util.Scanner;
public class Day2{
   public static void main(String[] args) {
      String name = "Sugata Laha Modak";
      int age = 21;
      double cgpa = 8.5;
      boolean isMCAStudent = true;
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("CGPA: " + cgpa);
      System.out.println("Is MCA Student: " + isMCAStudent);
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter your  first number: ");
      int num1 = scanner.nextInt();
      System.out.print("Enter your second number: ");
      int num2 = scanner.nextInt();
      int sum = num1 + num2;
      System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
       scanner.close();
   }
}