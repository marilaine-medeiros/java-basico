//Informar um saldo e imprimir o saldo com reajuste de 1%.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo inicial: ");
        double saldoInicial= scanner.nextDouble();

        //Calcula o saldo com reajuste
        double saldoReajustado = saldoInicial * 1.01;

        // Exibe o saldo reajustado
        System.out.println("Saldo com reajuste de 1%: " + saldoReajustado);

        scanner.close();



    }
}
