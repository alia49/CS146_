import java.util.Arrays;

public class lab1test {

    public static void main(String[] args) {
        lab1 solution = new lab1();

        // Test cases
        int[][] testNums = {
            {2, 7, 11, 15},   // Test case 1
            {3, 2, 4},        // Test case 2
            {-1, -2, -3, -4, -5}, // Test case 3
            {1, 5, 3, 7, 9},  // Test case 4
        };

        int[] testTargets = {9, 6, -8, 8}; // Corresponding targets for each test case

        for (int i = 0; i < testNums.length; i++) {
            // Run the twoSum method
            int[] result = solution.twoSum(testNums[i], testTargets[i]);
            // Print the result
            System.out.println("Test case " + (i+1) + ": " + Arrays.toString(testNums[i]) +
                               ", Target: " + testTargets[i] +
                               ", Result: " + Arrays.toString(result));
        }
    }
}
