/* Elabore um programa utilizando listas para armazenar 10 números 
e ao final escreva a quantidade de números negativos, positivos e nulos. */
package exercicios4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> numeros = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
      System.out.print("Digite o " + i + "º número: ");
      int numero = sc.nextInt();
      numeros.add(numero);
    }

    int positivos = 0;
    int negativos = 0;
    int nulos = 0;

    for (int numero : numeros) {
      if (numero > 0) {
        positivos++;
      } else if (numero < 0) {
        negativos++;
      } else {
        nulos++;
      }
    }

    System.out.println("\nQuantidade de números positivos: " + positivos);
    System.out.println("Quantidade de números negativos: " + negativos);
    System.out.println("Quantidade de números nulos: " + nulos);

    sc.close();
  }
}
