public class Day16 {
    //two pointer part 2
    public static void main(String[] args) {
        // Merge two sorted arrays
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        // Copy any remaining elements from either array
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
        // Print the merged array
        System.out.print("Merged array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }   
    }
}