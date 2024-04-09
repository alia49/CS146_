def two_sum(nums, target):
    # Dictionary to store the difference and its index
    hashmap = {}
    # Loop through each number in the array
    for i, num in enumerate(nums):
        # Calculate the complement by subtracting the current number from target
        complement = target - num
        # If the complement is found in the hashmap, return the solution
        if complement in hashmap:
            return [hashmap[complement], i]
        # Otherwise, store the index of the current number
        hashmap[num] = i
    # Return an empty list if no solution is found, though the problem statement assures there is one
    return []

# Example usage:
nums = [2, 7, 11, 15]
target = 9
print(two_sum(nums, target))  # Output will be [0, 1] as nums[0] + nums[1] == 9
