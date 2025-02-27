/* Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Cálculo das médias
        double media1 = (8 + 9 + 7) / 3.0;
        double media2 = (4 + 5 + 6) / 3.0;
        // Soma das médias
        double somaDasMedias = media1 + media2;

        // Média das médias
        double mediaDasMedias = somaDasMedias / 2;

        // Resultados
        System.out.println("Média dos números 8, 9 e 7: " + media1);
        System.out.println("Média dos números 4, 5 e 6: " + media2);
        System.out.println("Soma das duas médias: " + somaDasMedias);
        System.out.println("Média das médias: " + mediaDasMedias);

    }
}
