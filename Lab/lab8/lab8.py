
# Importing List from typing for type hinting
from typing import List

# Define the Solution class containing the coinChange method
class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        # Create a dp array with amount + 1 elements, all initialized to amount + 1
        dp = [amount + 1] * (amount + 1)
        dp[0] = 0  # Base case: No coins needed to make amount 0

        # Dynamic programming approach to fill in the dp array
        for coin in coins:
            for x in range(coin, amount + 1):
                dp[x] = min(dp[x], dp[x - coin] + 1)

        # Check if we have found a valid solution for the amount
        return dp[amount] if dp[amount] <= amount else -1

# Main code to test the solution with specific test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    coins = [1, 2, 5]
    amount = 11
    print(f"Test Case 1: coins = {coins}, amount = {amount} -> Output: {solution.coinChange(coins, amount)}")

    # Test case 2
    coins = [2]
    amount = 3
    print(f"Test Case 2: coins = {coins}, amount = {amount} -> Output: {solution.coinChange(coins, amount)}")

    # Test case 3
    coins = [1]
    amount = 0
    print(f"Test Case 3: coins = {coins}, amount = {amount} -> Output: {solution.coinChange(coins, amount)}")
