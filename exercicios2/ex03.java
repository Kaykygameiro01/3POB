/* Faça um programa para solicitar o nome e as duas notas e um aluno. Calcular sua média e informá-la. Se ela for inferior a 7, escrever "Reprovado”; caso contrário escrever "Aprovado".
 */
package exercicios2;

import java.util.Scanner;

public class ex03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entre com o nome do aluno: ");
    String nome = scanner.nextLine();

    System.out.print("entre com a Av1: ");
    double av1 = scanner.nextDouble();
    System.out.print("entre com a Av2: ");
    double av2 = scanner.nextDouble();

    double nota = (av1 + av2) / 2;

    System.out.println("Nome: " + nome);
    if (nota < 7) {
      System.out.print("reprovado!");
    } else {
      System.out.print("aprovado!");
    }
  }
}
