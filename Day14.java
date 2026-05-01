public class Day14{
    public static void main(String[] args) {
        // Two Sum Problem
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Two numbers found: " + arr[i] + " and " + arr[j]);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("No two numbers found that add up to the target.");
        }
    }
}