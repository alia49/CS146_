
def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
    return arr

# Time Complexity:
# Best Case: O(n) when the array is already sorted.
# Average Case: O(n^2) as each element is compared with all other elements in a nested loop.
# Worst Case: O(n^2) when the array is sorted in reverse order.
