
import java.util.HashMap;
import java.util.Map;

public class Hw8{
    public int longestPalindrome(String s) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        
        int length = 0;
        boolean oddUsed = false;
        for (int count : charCounts.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1; // Add the even part
                if (!oddUsed) {
                    length++; // Add one odd count as the center of palindrome
                    oddUsed = true;
                }
            }
        }
        return length;
    }
    
    public static void main(String[] args) {
        Hw8 hw8 = new Hw8();
        System.out.println(hw8.longestPalindrome("abccccdd")); // Output: 7
        System.out.println(hw8.longestPalindrome("speediskey")); // Output: 5
    }
}
