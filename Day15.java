public class Day15 {
    public static void main(String[] args) {
        // Two Pointer Technique
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 7; 
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;
        while (left < right) {  
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Two numbers found: " + arr[left] + " and " + arr[right]);
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }   
        if (!found) {
            System.out.println("No two numbers found that add up to the target.");
        }
          // Two sum Sorted Array
        int[] sortedArr = {1, 2, 3, 4, 5, 6};
        int sortedTarget = 10;
        int sortedLeft = 0;
        int sortedRight = sortedArr.length - 1; 
        boolean sortedFound = false;
        while (sortedLeft < sortedRight) {  
            int sum = sortedArr[sortedLeft] + sortedArr[sortedRight];
            if (sum == sortedTarget) {
                System.out.println("Two numbers found: " + sortedArr[sortedLeft] + " and " + sortedArr[sortedRight]);
                sortedFound = true;
                break;
            } else if (sum < sortedTarget) {
                sortedLeft++;
            } else {
                sortedRight--;
            }
        } 
        if (!sortedFound) {
            System.out.println("No two numbers found that add up to the target.");
        }
        // palindrome check using two pointers
        String str = "racecar";
        int leftPtr = 0;
        int rightPtr = str.length() - 1;
        boolean isPalindrome = true;
        while (leftPtr < rightPtr) {
            if (str.charAt(leftPtr) != str.charAt(rightPtr)) {
                isPalindrome = false;
                break;
            }
            leftPtr++;
            rightPtr--;
        }   
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
            // Reverse a string using two pointers
        String original = "Hello, World!";
        char[] charArray = original.toCharArray();
        int leftIndex = 0;
        int rightIndex = charArray.length - 1;
        while (leftIndex < rightIndex) {
            char temp = charArray[leftIndex];
            charArray[leftIndex] = charArray[rightIndex];
            charArray[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        String reversed = new String(charArray);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);

    }
}
