
/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
 Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
        System.out.println("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.println("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.println("Digite a idade em dias: ");
        int dias = scanner.nextInt();

// Calculo da idade em dias
        int totalDias = (anos * 365) + (meses * 30) + dias;

// Exibe o resultado
        System.out.println("A idade expressa em dias é: " + totalDias);

        scanner.close();

    }
}
