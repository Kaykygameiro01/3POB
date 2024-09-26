/*3.  Faça um programa que leia a idade de 10 pessoas. Ao final escreva a média das idades */

package exercicios3;

import java.util.Scanner;

public class ex03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int i;
    int media, soma = 0;

    for (i = 0; i < 3; i++) {
      System.out.print("Entre com a idade: ");
      int idade = scanner.nextInt();
      soma += idade;
    }
    media = soma / i;

    System.out.print("A média é  " + media);

    scanner.close();

  }
}
