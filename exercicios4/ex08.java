/* Faça um programa utilizando listas que leia 9 números inteiros. 
Ao final, o programa deve informar o maior número, a quantidade de vezes que ele ocorre 
e em quais posições da lista. */
package exercicios4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> numeros = new ArrayList<>();

    for (int i = 1; i <= 9; i++) {
      System.out.print("Digite o " + i + "º número inteiro: ");
      int numero = sc.nextInt();
      numeros.add(numero);
    }

    int maior = numeros.get(0);
    for (int numero : numeros) {
      if (numero > maior) {
        maior = numero;
      }
    }

    int quantidade = 0;
    ArrayList<Integer> posicoes = new ArrayList<>();
    for (int i = 0; i < numeros.size(); i++) {
      if (numeros.get(i) == maior) {
        quantidade++;
        posicoes.add(i);
      }
    }

    System.out.println("\nMaior número: " + maior);
    System.out.println("Quantidade de vezes que ele ocorre: " + quantidade);
    System.out.println("Posições em que ele ocorre: " + posicoes);

    sc.close();
  }
}
