import java.util.*;
public class Day4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Kon Number Er Namta Chao : ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
         System.out.println("Sum of N numbers :");
         System.out.print("Koto Obdi Jog Korbe : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " numbers is: " + sum);    
            sc.close();

}
}
