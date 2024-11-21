/* Construa um programa que armazene números inteiros em uma lista de 10 posições, 
calcule o quadrado de cada elemento armazenado nesta lista e armazene o resultado em outra lista. 
Ao final, os dados da segunda lista devem ser exibidos. */
package exercicios4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> numeros = new ArrayList<>();
    ArrayList<Integer> quadrados = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
      System.out.print("Digite o " + i + "º número inteiro: ");
      int numero = sc.nextInt();
      numeros.add(numero);
    }

    for (int numero : numeros) {
      quadrados.add(numero * numero);
    }

    System.out.println("\nOs quadrados dos números são:");
    for (int quadrado : quadrados) {
      System.out.println(quadrado);
    }

    sc.close();
  }
}
