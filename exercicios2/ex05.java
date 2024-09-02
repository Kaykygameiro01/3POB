/*Faça um programa que leia dois números e mostre qual o maior dos dois. O programa deve informar caso sejam iguais. 
 */
package exercicios2;

import java.util.Scanner;

public class ex05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entre com um número: ");
    double numero1 = scanner.nextDouble();
    System.out.print("Entre com outro número: ");
    double numero2 = scanner.nextDouble();

    if (numero1 > numero2) {
      System.out.println("o número 1 é maior");
    } else {
      if (numero2 > numero1) {
        System.out.println("O número 2 é maior");
      } else {
        System.out.println("ambos os números são iguais");

      }
    }

  }
}
