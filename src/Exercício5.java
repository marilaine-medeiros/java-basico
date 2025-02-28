/* Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1SM=R$788,00)
 */

import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário: ");
        double salarioUsuario = scanner.nextDouble();

        // A variável final é usada para definir uma constante.
        // Um valor que não pode ser modificado após sua atribuição
        final double SALARIO_MINIMO = 788.00;

        double quantidadeSalariosMinimo = salarioUsuario / SALARIO_MINIMO;

        System.out.println("Você recebe " + quantidadeSalariosMinimo + " salários mínimos. ");

        scanner.close();


    }
}
