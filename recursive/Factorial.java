package recursive;

public class Factorial {
    // n! = n*(n-1)(n-2)!...(n-n)!
    public static int factorial(int n) {
        int result;
        if (n == 1 || n == 0) return 1;
        result = n * factorial(n - 1);
        return result;
    }
}
