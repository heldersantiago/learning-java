package recursive;

public class RecursiveMain {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Factorial de " + i + " é " + Factorial.factorial(i));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(" n = " + i + " " + Fibonnaci.Fn(i));
        }

    }
}
