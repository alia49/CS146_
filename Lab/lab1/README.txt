Function two_sum
    Input: array of integers 'nums', integer 'target'
    Output: array of two integers

    // Initialize an empty hashmap
    Declare hashmap as Map

    // Loop through each element in 'nums'
    For each index 'i' and element 'num' in 'nums'
        // Calculate the complement of 'num' as 'target' - 'num'
        Set 'complement' to 'target' - 'num'
        
        // Check if 'complement' is already in our hashmap
        If hashmap contains key 'complement'
            // If found, return the current index 'i' and the stored index for 'complement'
            Return array containing hashmap value of 'complement' and 'i'
        
        // If not found, add 'num' and its index 'i' to the hashmap
        Add 'num' with value 'i' to hashmap

    // If no pair is found, return an empty array (problem guarantees one solution so this won't be reached)
    Return empty array

End Function

// Example call to the function
Declare 'nums' as array [2, 7, 11, 15]
Declare 'target' as integer 9
Print the result of two_sum called with 'nums' and 'target'
