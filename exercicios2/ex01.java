
/*1.  Faça um programa para solicitar o nome e a idade de uma pessoa. Se sua idade for menor que 18 anos, escrever a mensagem: "É menor".
 */
package exercicios2;

import java.util.Scanner;

public class ex01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entre com o nome: ");
    String nome = scanner.nextLine();

    System.out.print("Entre com a idade da pessoa: ");
    int idade = scanner.nextInt();

    if (idade >= 18) {
      System.out.print("É maior");
    } else {
      System.out.print("É menor");
    }
  }
  scanner.close();
}