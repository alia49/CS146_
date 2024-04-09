
public class Hw1 {

    // Approach 1: Using Built-in Methods
    public static boolean isPalindromeBuiltIn(String s) {
        // Normalize the string
        String normalized = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        // Compare the string with its reverse
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }

    // Approach 2: Two Pointer Technique
    public static boolean isPalindromeTwoPointers(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            // Compare characters case-insensitively
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            // Move towards the center
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panama";
        System.out.println("Built-in Method: " + isPalindromeBuiltIn(test));
        System.out.println("Two Pointers: " + isPalindromeTwoPointers(test));
    }
}
