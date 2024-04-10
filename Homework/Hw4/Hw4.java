public class Hw4{

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Time Complexity:
    // Best Case: O(n) when the array is already sorted.
    // Average Case: O(n^2) as each element is compared with all other elements in a nested loop.
    // Worst Case: O(n^2) when the array is sorted in reverse order.
