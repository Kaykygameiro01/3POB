/* Faça um programa utilizando listas que leia 10 números inteiros 
e ao final escreva estes números na ordem crescente e na ordem decrescente. */
package exercicios4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> numeros = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
      System.out.print("Digite o " + i + "º número inteiro: ");
      int numero = sc.nextInt();
      numeros.add(numero);
    }

    ArrayList<Integer> ordemCrescente = new ArrayList<>(numeros);
    Collections.sort(ordemCrescente);

    ArrayList<Integer> ordemDecrescente = new ArrayList<>(numeros);
    Collections.sort(ordemDecrescente, Collections.reverseOrder());

    System.out.println("\nNúmeros em ordem crescente:");
    for (int numero : ordemCrescente) {
      System.out.print(numero + " ");
    }

    System.out.println("\n\nNúmeros em ordem decrescente:");
    for (int numero : ordemDecrescente) {
      System.out.print(numero + " ");
    }

    sc.close();
  }
}
