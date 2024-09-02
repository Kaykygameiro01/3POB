
package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.print("Entre o código do produto: ");
    int codigo = scanner.nextInt();
    System.out.print("Entre a quantidade de produtos: ");
    int quantidade = scanner.nextInt();
    System.out.print("Entre o valor de cada produto: ");
    double valorUnitario = scanner.nextDouble();
    System.out.print("Entre a forma de pagamento1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito):  ");
    int formaPagamento = scanner.nextInt();

    double valorTotal = quantidade * valorUnitario;
    double desconto;
    double valorFinal;

    switch (formaPagamento) {
      case 1:
        desconto = valorTotal * 0.10;
        break;
      case 2:
        desconto = valorTotal * 0.02;
        break;
      case 3:
        desconto = valorTotal * 0.05;
        break;
      case 4:
        desconto = valorTotal * 0.03;
        break;
      default:
        desconto = 0.0;
        System.out.println("forma de pagamento nao existente");
    }

    valorFinal = valorTotal - desconto;

    System.out.println("Valor total antes do desconto: " + df.format(valorTotal));
    System.out.println("Valor do desconto: " + df.format(desconto));
    System.out.println("Valor final a pagar: " + df.format(valorFinal));
  }
}
/*
 * Faça um programa que leia o código, a quantidade, o preço unitário e a forma
 * de pagamento (1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão
 * crédito) de um produto. Pagamentos em dinheiro recebem um desconto de 10%, em
 * cartão de débito 5%, em cartão de crédito 3% e em cheque 2%. O programa deve
 * informar o valor do desconto e o valor final a pagar.
 */
