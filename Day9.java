public class Day9 {
    // Master Recursion
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
     // Factorial of n number 
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        } // factorial(5) -> 5*4*3*2*1= 120
    }
    // Sum of n 
    static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        } // sum(5) -> 5+4+3+2+1= 15
    }
    // Fibonacci series
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    } // fibonacci (6) -> 5+4+3+2+1= 15
     
    
}
