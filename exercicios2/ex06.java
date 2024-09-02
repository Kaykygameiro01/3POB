/*Crie um programa para ler o valor do salário mínimo, o nome e o salário bruto de um empregado. Se o seu salário for menor que um salário mínimo descontar 2%; se for igual, descontar 5%, e se for superior, descontar 8%. Informar o valor do desconto e o salário líquido. */

package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.print("Entre com o salário mínimo: ");
    double salarioMinimo = scanner.nextDouble();

    System.out.print("Entre com o nome do empregado: ");
    String nome = scanner.nextLine();

    System.out.print("Entre com o salário bruto do empregado: ");
    double salarioBruto = scanner.nextDouble();

    double desconto;
    if (salarioBruto < salarioMinimo) {
      desconto = salarioBruto * 0.02;
    } else if (salarioBruto == salarioMinimo) {
      desconto = salarioBruto * 0.05;
    } else {
      desconto = salarioBruto * 0.08;
    }

    double salarioLiquido = salarioBruto - desconto;

    System.out.println("Nome do empregado: " + nome);
    System.out.println("O valor do desconto é de " + df.format(desconto));
    System.out.println("O valor do salário líquido é de " + df.format(salarioLiquido));
  }
}
