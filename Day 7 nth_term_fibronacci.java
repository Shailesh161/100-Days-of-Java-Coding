

public class nth_term_fibronacci 
{
    // Function to return the Nth term of the Fibonacci series.
    public static long findNthFibonacci(int n) {
        if (n <= 0) {
            return -1; // Invalid input, return -1 or handle appropriately
        }

        if (n == 1 || n == 2) {
            return 1; // The first two terms of the Fibonacci series are 1
        }

        long a = 1, b = 1, nextTerm = 0;

        // Iteratively calculate the Nth term
        for (int i = 3; i <= n; i++) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
        }

        return nextTerm;
    }

    public static void main(String[] args) {
        int N = 5;
        long result = findNthFibonacci(N);
        System.out.println("The " + N + "th term of the Fibonacci series is: " + result);
    }
}
