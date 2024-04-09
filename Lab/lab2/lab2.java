
import java.util.Arrays;

public class lab2{

    public boolean isAnagram(String s, String t) {
        // Convert strings to char arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        // Sort both char arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        // Compare sorted arrays
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        lab2 checker = new lab2();
        System.out.println(checker.isAnagram("listen", "silent")); // true
        System.out.println(checker.isAnagram("hello", "world"));   // false
    }
}
