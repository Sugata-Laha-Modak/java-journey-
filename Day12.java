public class Day12 {
    // Array - A collection of elements of the same type
    // int[] numbers = {1, 2, 3, 4, 5};
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        // length - to get the length of the array
        int length = numbers.length;
        System.out.println("Length of the array: " + length);
        // Accessing elements - using index
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[length - 1]);
        // Looping through the array
        System.out.print("Array elements: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
     // Multidimensional arrays or 2D arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Element at (1,1): " + matrix[1][1]);
        // Output: 5
        // Sum of Array Elements
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);
         // Sum of 2D Array Elements
        int sum2D = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum2D += matrix[i][j];
            }
        }
        System.out.println("Sum of 2D array elements: " + sum2D);
    } 
}
