/*1.  Faça um programa utilizando listas que leia o nome e a altura de 50 pessoas e ao final escreva o nome e a altura das pessoas com mais de 1,70 metros.
 */

package exercicios4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> nomes = new ArrayList<>();
    ArrayList<Double> alturas = new ArrayList<>();

    for (int i = 0; i < 50; i++) {
      System.out.print("Entre com o nome: ");
      String nome = scanner.nextLine();

      System.out.print("Entre com a altura: ");
      double altura = scanner.nextDouble();
      scanner.nextLine();

      // Armazena nome e altura nas listas
      nomes.add(nome);
      alturas.add(altura);
    }

    System.out.println("\nPessoas com mais de 1,70 metros:");
    for (int i = 0; i < nomes.size(); i++) {
      if (alturas.get(i) > 1.70) {
        System.out.println("Nome: " + nomes.get(i) + ", Altura: " + alturas.get(i));
      }
    }

    scanner.close();
  }
}