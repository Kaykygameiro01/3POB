package exercicios3;

import java.util.Scanner;

public class ex01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i;
    int somatorio = 0;
    int valorProduto;

    for (i = 0; i < 10; i++) {
      System.out.print("Qual o valor do produto?");
      valorProduto = scanner.nextInt();
      somatorio = somatorio + valorProduto;
    }

    System.out.print("o somatório é  " + somatorio);

    scanner.close();
  }
}

/*
 * Faça um programa que leia o preço de 10 produtos.
 * Ao final escreva o somatório dos preços.
 */
