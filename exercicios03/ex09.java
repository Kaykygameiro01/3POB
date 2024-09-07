/*A conversão de graus Farenheit para graus centígrados é obtida por : C = 5/9 * (F -32). Faça um programa que calcule e escreva uma tabela de centígrados em função de graus Farenheit, que variam de 100 a 150 de 1 em 1. */

package exercicios03;

import java.text.DecimalFormat;

public class ex09 {

  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.println("Tabela de conversão de Fahrenheit para Celsius:");
    System.out.println("Fahrenheit\tCelsius");

    for (int F = 100; F <= 150; F++) {
      double C = 5.0 / 9.0 * (F - 32);
      System.out.println(F + "\t\t" + df.format(C));
    }
  }
}
