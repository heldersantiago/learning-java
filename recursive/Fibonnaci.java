package recursive;

public class Fibonnaci {
    // Rules
    // F0 = 0
    // F1 = 1
    // Fn = Fn-1 + Fn-2

    public static int Fn(int n) {
        int result;
        if (n == 0) return 0;
        if (n == 1) return 1;
        return result = Fn(n - 1) + Fn(n - 2);
    }
}
