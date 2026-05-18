public  class Day31 {
 // Dynamic Programming (DP) is a method for solving complex problems by breaking them down into simpler subproblems and storing the results of those subproblems to avoid redundant work. It is often used to optimize recursive algorithms by using memoization (top-down approach) or tabulation (bottom-up approach). DP is particularly effective for problems that exhibit overlapping subproblems and optimal substructure, such as the Fibonacci sequence, knapsack problem, and longest common subsequence. By storing previously computed results, DP can significantly reduce the time complexity of algorithms, making it a powerful tool for solving a wide range of computational problems efficiently.
  // Example: Fibonacci Sequence using Dynamic Programming
    public static int fibonacci(int n) {
        int[] dp = new int[n + 1]; // Create a DP array to store results
        dp[0] = 0; // Base case
        if (n > 0) {
            dp[1] = 1; // Base case
        }
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // Fill the DP array using the Fibonacci formula
        }
        return dp[n]; // Return the nth Fibonacci number
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }
     // Notes: In this example, we use a bottom-up approach to compute the Fibonacci sequence. We create a DP array where each index represents the Fibonacci number at that position. We fill the array iteratively, starting from the base cases, and use previously computed values to calculate the next Fibonacci numbers. This approach has a time complexity of O(n) and a space complexity of O(n). Alternatively, we could optimize space by only keeping track of the last two computed values instead of the entire array.
     // Dynamic Programming is a powerful technique that can be applied to a wide range of problems, including optimization problems, combinatorial problems, and problems involving sequences. It is essential to identify the overlapping subproblems and optimal substructure in order to effectively apply DP to solve a problem efficiently.
     // Dynamic Programming can be applied to various types of problems, such as:
        // 1. Optimization Problems: These problems involve finding the best solution among a set of possible solutions. Examples include the Knapsack problem, where you need to maximize the value of items that can be placed in a knapsack with a weight limit, and the Coin Change problem, where you need to find the minimum number of coins required to make a certain amount.
        // 2. Combinatorial Problems: These problems involve counting the number of ways to arrange or combine items. Examples include the Longest Common Subsequence problem, where you need to find the longest subsequence common to two sequences, and the Catalan numbers, which count certain types of combinatorial structures.
        // 3. Sequence Problems: These problems involve finding patterns or relationships in sequences of numbers. Examples include the Fibonacci sequence, where each number is the sum of the two preceding ones, and the Longest Increasing Subsequence problem, where you need to find the longest subsequence of a given sequence that is strictly increasing.
        // 4. Dynamic Programming can also be applied to problems in graph theory, such as the Shortest Path problem, where you need to find the shortest path between two vertices in a graph, and the Traveling Salesman Problem, where you need to find the shortest possible route that visits a set of cities and returns to the origin city.
        // To effectively apply Dynamic Programming, it is crucial to identify the overlapping subproblems and optimal substructure in the problem at hand. Overlapping subproblems occur when the same subproblems are solved multiple times, while optimal substructure means that the optimal solution to a problem can be constructed from optimal solutions to its subproblems. By recognizing these properties, you can design a DP solution that efficiently computes the desired result while avoiding redundant calculations.
        // More about dp
        // 1. Memoization (Top-Down Approach): In this approach, you start with the original problem and recursively break it down into smaller subproblems. You store the results of these subproblems in a data structure (like an array or a hash map) so that when the same subproblem is encountered again, you can simply return the stored result instead of recomputing it. This approach is often easier to implement and understand, especially for problems that are naturally expressed in a recursive manner.
        // 2. Tabulation (Bottom-Up Approach): In this approach, you start with the smallest subproblems and iteratively build up the solution to the original problem. You typically use a table (like an array) to store the results of subproblems, and you fill this table in a systematic way, starting from the base cases and working your way up to the desired solution. This approach can be more efficient in terms of space complexity, as it often allows you to overwrite previous results that are no longer needed.
        
    
}
    

