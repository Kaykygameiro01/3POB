/* Elabore um programa usando listas que leia a matrícula e o salário bruto de 100 empregados. Os dados devem ser armazenados em listas. O programa deve descontar 11% do salário bruto de cada empregado e ao final escrever: a matrícula, o salário bruto, o desconto e o salário líquido de cada empregado. */
package exercicios4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Criando listas para armazenar os dados dos empregados
    ArrayList<String> matriculas = new ArrayList<>();
    ArrayList<Double> salariosBrutos = new ArrayList<>();
    double descontoPercentual = 0.11; // 11% de desconto

    // Entrada de dados para 100 empregados
    for (int i = 1; i <= 100; i++) {
      System.out.print("Digite a matrícula do empregado " + i + ": ");
      String matricula = sc.next();
      matriculas.add(matricula);

      System.out.print("Digite o salário bruto do empregado " + i + ": ");
      double salarioBruto = sc.nextDouble();
      salariosBrutos.add(salarioBruto);
    }

    // Exibindo a matrícula, salário bruto, desconto e salário líquido
    System.out.println("\nFolha de pagamento:");
    System.out.println("Matrícula\tSalário Bruto\tDesconto (11%)\tSalário Líquido");
    for (int i = 0; i < matriculas.size(); i++) {
      double salarioBruto = salariosBrutos.get(i);
      double desconto = salarioBruto * descontoPercentual;
      double salarioLiquido = salarioBruto - desconto;

      System.out.println(matriculas.get(i) + "\t\tR$ " + String.format("%.2f", salarioBruto)
          + "\t\tR$ " + String.format("%.2f", desconto)
          + "\t\tR$ " + String.format("%.2f", salarioLiquido));
    }

    sc.close();
  }
}
