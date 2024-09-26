/*8.  Crie um programa que leia o nome e a altura de 10 pessoas e ao final escreva: a altura média do grupo, o nome e a altura da pessoa mais alta.
 */

package exercicios3;

import java.util.Scanner;

public class ex08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int i;
    double altura, maisAlto = 0, media, somaAltura = 0;
    String nome, nomeMaisAlto = "";

    for (i = 0; i < 3; i++) {
      System.out.print("Entre com o nome: ");
      nome = scanner.nextLine();
      System.out.print("Entre com a altura em metros: ");
      altura = scanner.nextDouble();
      somaAltura += altura;
      scanner.nextLine();

      if (altura > maisAlto) {
        maisAlto = altura;
        nomeMaisAlto = nome;
      }
    }

    media = somaAltura / 3;

    System.out.println("A altura média do grupo é: " + media + " metros");
    System.out.println("A pessoa mais alta é " + nomeMaisAlto + " com " + maisAlto + " metros");
    scanner.close();
  }
}
