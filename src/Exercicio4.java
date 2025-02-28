/* Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor das peças - o código da peça 1,
valor unitário da peça 1, quantidade de peças 1 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a porcentagem do IPI
        System.out.println("Digite a porcentagem do IPI a ser acrescido nas peças: ");
        double ipi = scanner.nextDouble();

        // Dados da peça 1
        System.out.println("Digite o código da peça 1: ");
        int codigoPeca1 = scanner.nextInt();
        System.out.println("Digite o valor unitário da peça 1: ");
        double valorPeca1 = scanner.nextDouble();
        System.out.println("Digite a quantidade de peças 1: ");
        int quantidadePeca1 = scanner.nextInt();

        // Dados da peça 2
        System.out.println("Digite o código da peça 2: ");
        int codigoPeca2 = scanner.nextInt();
        System.out.println("Digite o valor unitário da peça 2: ");
        double valorPeca2 = scanner.nextDouble();
        System.out.println("Digite a quantidade de peças 2: ");
        int quantidadePeca2 = scanner.nextInt();

        // Valor total a ser pago
        double valorTotal = (valorPeca1 * quantidadePeca1 + valorPeca2 * quantidadePeca2) * (ipi / 100 + 1);

        // Resultado
        System.out.println("O valor total a ser pago é: " + valorTotal);

        scanner.close();



    }
}
