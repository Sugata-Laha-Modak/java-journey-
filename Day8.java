public class Day8 {
    
    public static void main(String[] args) {
        int sum = add(5, 10);
        System.out.println("Is 10 even? " + isEven(10));
        greet ("Sugata");
        System.out.println("The sum is: " + sum);
        int marks[] = {85, 90, 78, 92, 88};
        int maxMarks = findMax(marks);
        System.out.println("The maximum marks are: " + maxMarks);
        boolean result = isEven(10);
        System.out.println("Is 10 even? " + result);
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static void greet (String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}