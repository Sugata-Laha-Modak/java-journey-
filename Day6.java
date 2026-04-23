import java.util.*;
public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want for avg : ");
        int n = sc.nextInt();
       int numbers[] = new int[n];
       int sum = 0;
         for(int i = 0; i < n; i++){
          System.out.println("Enter number " + (i+1) + " : ");
          numbers[i] = sc.nextInt();
          sum += numbers[i];
         }
            double average = (double) sum / n;
            System.out.println("Average of the numbers is: " + average);
            int max = numbers[0];
            for (int i = 1; i < n; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println("The maximum number is: " + max);
            System.out.println("Enter a number to search: ");
            for (int num: numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            sc.close(); 
    }
}   
