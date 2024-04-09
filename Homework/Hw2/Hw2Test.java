public class Hw2Test extends Hw2 {
    // Override the isBadVersion method for testing
    @Override
    boolean isBadVersion(int version) {
        // Simulate that versions 4 and above are bad
        return version >= 4;
    }

    public static void main(String[] args) {
        Hw2Test test = new Hw2Test();
        
        int n = 5; // Total versions
        int expected = 4; // Expected first bad version
        int result = test.firstBadVersion(n);
        
        if (result == expected) {
            System.out.println("Test passed. First bad version is " + result);
        } else {
            System.out.println("Test failed. Expected " + expected + " but got " + result);
        }
    }
}
