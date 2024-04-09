public class Hw2 {
    // Assuming a method isBadVersion(int version) exists and returns a boolean

    // Method to find the first bad version
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    // Dummy isBadVersion method (replace or implement accordingly)
    boolean isBadVersion(int version) {
        // Implement your mechanism to identify if a version is bad
        // For example, return version >= firstBadVersion;
        return false; // Placeholder implementation
    }
}
