package aula1;

public class Exercicio3 {
    // Imprima todos os multiplos de 3, entre 1 e 100

    static public void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) System.out.println("Multiplo de 3 e " + i);
        }
    }
}
