/* 5.  Crie um programa que leia a altura de um número indeterminado de pessoas. Ao final o programa deve informar o total de pessoas cadastradas, a quantidade de pessoas com altura inferior a 1,60 metros; a quantidade de pessoas com altura entre 1,60 metros e 1,80 metros e a quantidade de pessoas com altura superior a 1,80 metros.
*/

package exercicios3;

import java.util.Scanner;

public class ex05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i, contInferior = 0, contEntre = 0, contSuperior = 0;
    double altura;

    for (i = 0; i < 3; i++) {
      System.out.print("Entre com a altura em metros: ");
      altura = scanner.nextDouble();
      if (altura < 1.60) {
        contInferior++;
      } else {
        if (altura >= 1.60 && altura <= 1.80) {
          contEntre++;
        } else {
          contSuperior++;
        }
      }
    }
    int contTotal = contEntre + contInferior + contSuperior;
    System.out.println("Quantidade de pessoas cadastradas: " + contTotal);

    System.out.println("Quantidade de pessoas com altura inferior a 1.60: " + contInferior);
    System.out.println("Quantidade de pessoas com altura entre 1.60 e 1.80: " + contEntre);
    System.out.println("Quantidade de pessoas com altura superior a 1.80: " + contSuperior);
    scanner.close();

  }

}
