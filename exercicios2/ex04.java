/*4.  Elabore um programa para solicitar o nome, o sexo e o salário bruto de um empregado. Se o seu sexo for masculino, descontar 5% de seu salário; caso contrário, descontar 3%. Informar o valor do desconto e o salário líquido. */

package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex04 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.print("Entre com o nome: ");
    String nome = scanner.nextLine();
    System.out.print("Entre com o sexo: (M ou F)");
    String sexo = scanner.nextLine().toUpperCase();
    System.out.print("Entre com o salário: ");
    double salario = scanner.nextDouble();

    if (sexo.equals("M")) {
      double desconto = salario * 0.05;
      double salarioLiquido = salario - desconto;
      System.out.println("Nome do empregado: " + nome);
      System.out.println("O valor do desconto é de " + df.format(desconto));
      System.out.println("O valor do salário líquido é de " + df.format(salarioLiquido));

    } else {
      double desconto = salario * 0.03;
      double salarioLiquido = salario - desconto;
      System.out.println("Nome da empregada: " + nome);
      System.out.println("O valor do desconto é de " + df.format(desconto));
      System.out.println("O valor do salário líquido é de " + df.format(salarioLiquido));
    }
  }
}
