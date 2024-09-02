/*Elabore um programa que leia três números diferentes e informe o maior deles. */

package exercicios2;

import java.util.Scanner;

public class ex07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entre com 3 números separados por espaço: ");
    int numero1 = scanner.nextInt();
    int numero2 = scanner.nextInt();
    int numero3 = scanner.nextInt();

    if (numero1 > numero2 && numero1 > numero3) {
      System.out.print("o número 1 é maior");

    } else {
      if (numero2 > numero1 && numero2 > numero3) {
        System.out.print("o número 2 é maior");
      } else {
        if (numero3 > numero1 && numero3 > numero2) {
          System.out.print("o número 3 é maior");
        } else {
          System.out.print("os números são iguais");

        }
      }
    }
  }
}
