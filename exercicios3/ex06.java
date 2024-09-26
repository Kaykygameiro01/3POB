/*
6.  Elabore um programa que leia a idade de diversas pessoas e ao final informe: o total de pessoas cadastradas, a
porcentagem de pessoas com idade inferior a 18 anos, a porcentagem de pessoas com idade igual ou superior a 18 anos. */
package exercicios3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    int i, idade;
    int totalPessoas, idadeInferior = 0, idadeSuperior = 0;

    for (i = 0; i < 3; i++) {
      System.out.print("Entre com a idade: ");
      idade = scanner.nextInt();
      if (idade < 18) {
        idadeInferior++;
      } else {
        idadeSuperior++;
      }
    }
    totalPessoas = idadeInferior + idadeSuperior;

    double porcentagemInferior = ((double) idadeInferior / totalPessoas) * 100;
    double porcentagemSuperior = ((double) idadeSuperior / totalPessoas) * 100;

    System.out.println("O total de pessoas cadastradas é  " + totalPessoas);
    System.out.println("A porcentagem de pessoas com idade inferior a 18 anos  " + df.format(porcentagemInferior));
    System.out.println("A porcentagem de pessoas com idade superior a 18 anos  " + df.format(porcentagemSuperior));

    scanner.close();

  }
}