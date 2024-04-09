public class Hw1test {

    public static void main(String[] args) {
        // Array of test cases
        String[] testCases = {
            "A man, a plan, a canal: Panama",
            "race a car",
            " ",
            "a.",
            "0P",
            "A Toyota's a Toyota",
            "Not a Palindrome",
            "Madam, I'm Adam"
        };
        
        // Expected results for the test cases
        boolean[] expectedResults = {true, false, true, true, false, true, false, true};

        // Test using the first approach
        System.out.println("Testing the first approach:");
        testPalindromeChecker(testCases, expectedResults, true);

        // Test using the second approach
        System.out.println("\nTesting the second approach:");
        testPalindromeChecker(testCases, expectedResults, false);
    }

    private static void testPalindromeChecker(String[] testCases, boolean[] expectedResults, boolean useFirstMethod) {
        for (int i = 0; i < testCases.length; i++) {
            boolean result;
            if (useFirstMethod) {
                result = Hw1.isPalindromeBuiltIn(testCases[i]);
            } else {
                result = Hw1.isPalindromeTwoPointers(testCases[i]);
            }
            System.out.println("Test case " + (i + 1) + ": " + testCases[i]);
            System.out.println("Expected result: " + expectedResults[i] + ", Actual result: " + result);
            System.out.println("Test " + ((result == expectedResults[i]) ? "PASSED" : "FAILED") + "\n");
        }
    }
}
