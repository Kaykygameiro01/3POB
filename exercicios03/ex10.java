/*Elabore um programa que leia diversos números e ao final escreva: a quantidade de números digitados, a quantidade de números pares, a quantidade de números ímpares.
*/
package exercicios03;

import java.util.Scanner;

public class ex10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero, contPar = 0, contImpar = 0;

    for (int i = 0; i < 10; i++) {
      System.out.print("Entre com um número");
      numero = scanner.nextInt();

      if ((numero % 2) == 0) {
        contPar++;
      } else {
        contImpar++;
      }
    }
    int totalNumeros = contImpar + contPar;

    System.out.println("O total de números digitados foi: " + totalNumeros);
    System.out.println("O total de números pares digitados foi: " + contPar);
    System.out.println("O total de números ímpares digitados foi: " + contImpar);

  }
}
