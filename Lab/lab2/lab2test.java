
import java.util.Arrays;

public class lab2test {

    public static void main(String[] args) {
        lab2test checker = new lab2test();
        
        // Test cases
        String[][] cases = {
            {"anagram", "nagaram", "true"},
            {"rat", "car", "false"},
            {"", "", "true"},
            {"a", "ab", "false"},
            {"test", "ttew", "false"},
            {"listen", "silent", "true"}
        };
        
        for (String[] aCase : cases) {
            String s1 = aCase[0];
            String s2 = aCase[1];
            boolean expected = Boolean.parseBoolean(aCase[2]);
            boolean result = checker.isAnagram(s1, s2);
            
            System.out.printf("Testing isAnagram with inputs \"%s\" and \"%s\": %s (Expected: %s)\n",
                    s1, s2, result, expected);
            if (result != expected) {
                System.out.println("Test failed.");
            } else {
                System.out.println("Test passed.");
            }
        }
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        return Arrays.equals(sArray, tArray);
    }
}
