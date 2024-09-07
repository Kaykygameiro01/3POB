/*7.  Faça um programa que leia vários números inteiros e ao final escreva o maior.
 */
package exercicios03;

import java.util.Scanner;

public class ex07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int maior = 0, numero;

    for (int i = 0; i < 10; i++) {
      System.out.print("Entre com um número: ");
      numero = scanner.nextInt();

      if (numero > maior) {
        maior = numero;
      }
    }
    System.out.println("O maior número é: " + maior);
    scanner.close();

  }

}
