/* Elabore um programa que contenha três listas de 10 posições A, B e C. 
O objetivo do programa é armazenar números nas listas A e B e fazer com que a lista C receba 
a soma dos elementos correspondentes de A e B. 
Ao final, o programa deve exibir no vídeo o conteúdo da lista C. */
package exercicios4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> listaA = new ArrayList<>();
    ArrayList<Integer> listaB = new ArrayList<>();
    ArrayList<Integer> listaC = new ArrayList<>();

    System.out.println("Digite os 10 números para a lista A:");
    for (int i = 1; i <= 10; i++) {
      System.out.print("A[" + i + "]: ");
      int numero = sc.nextInt();
      listaA.add(numero);
    }

    System.out.println("\nDigite os 10 números para a lista B:");
    for (int i = 1; i <= 10; i++) {
      System.out.print("B[" + i + "]: ");
      int numero = sc.nextInt();
      listaB.add(numero);
    }

    for (int i = 0; i < 10; i++) {
      int soma = listaA.get(i) + listaB.get(i);
      listaC.add(soma);
    }

    System.out.println("\nOs valores da lista C (soma de A e B) são:");
    for (int i = 0; i < listaC.size(); i++) {
      System.out.println("C[" + (i + 1) + "]: " + listaC.get(i));
    }

    sc.close();
  }
}
