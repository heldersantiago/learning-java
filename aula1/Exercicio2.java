package aula1;

public class Exercicio2 {
    // Imprima a soma de 1 a 1000
    // sn = (a1 + an)*n/2
    static int s = 0;

    static public void main(String[] args) {
        for (int i = 1; i <= 1000; i++) s += i;
        System.out.println("Somatorio e " + s);
    }
}
