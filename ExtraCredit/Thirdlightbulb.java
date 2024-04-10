public class Thirdlightbulb {
 
    public static long fib(int n) {
        if (n <= 1) {
            return n;
        }
        long[] fibCache = new long[n + 1];
        fibCache[0] = 0;
        fibCache[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            fibCache[i] = fibCache[i - 1] + fibCache[i - 2];
        }
        
        return fibCache[n];
    }

    public static void main(String[] args) {
        int n = 9; // Example: Finding the 9th Fibonacci number
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    } 
}
