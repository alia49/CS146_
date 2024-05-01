
import java.util.Arrays;

public class lab8{
    public int coinChange(int[] coins, int amount) {
        // Initialize a dp array with amount + 1 elements, all set to amount + 1
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0; // Base case: no coins needed to make amount 0

        // Fill the dp array using the bottom-up dynamic programming approach
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin] + 1);
            }
        }

        // If dp[amount] is still set to amount + 1, it means it's not possible to form the amount
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        lab8 solution = new lab8();
        
        // Test cases
        System.out.println("Test Case 1: " + solution.coinChange(new int[] {1, 2, 5}, 11)); // Output: 3
        System.out.println("Test Case 2: " + solution.coinChange(new int[] {2}, 3));         // Output: -1
        System.out.println("Test Case 3: " + solution.coinChange(new int[] {1}, 0));         // Output: 0
    }
}
