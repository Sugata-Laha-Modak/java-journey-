// Linear Search
import java.util.Scanner;
class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
        // Binary Search (array must be sorted)
        int[] sortedArr = {10, 20, 30, 40, 50};
        System.out.print("Enter the element to search in sorted array: ");
        int sortedKey = sc.nextInt();
        int left = 0;
        int right = sortedArr.length - 1;
        boolean sortedFound = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sortedArr[mid] == sortedKey) {
                sortedFound = true;
                break;
            } else if (sortedArr[mid] < sortedKey) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (sortedFound) {
            System.out.println("Element found in the sorted array.");
        } else {
            System.out.println("Element not found in the sorted array.");
        }
        // First and Last Occurrence
        int[] arrWithDuplicates = {10, 20, 20, 30, 40, 50};
        System.out.print("Enter the element to find first and last occurrence: ");
        int duplicateKey = sc.nextInt();
        int firstOccurrence = -1;   
        int lastOccurrence = -1;
        for (int i = 0; i < arrWithDuplicates.length; i++) {
            if (arrWithDuplicates[i] == duplicateKey) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of the element is at index: " + firstOccurrence);
            System.out.println("Last occurrence of the element is at index: " + lastOccurrence);
        } else {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}