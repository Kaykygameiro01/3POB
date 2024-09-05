/*  Elabore um programa para solicitar o nome de uma equipe de futebol, a quantidade de derrotas, empates e vitórias obtidas por ela no campeonato. Calcular e informar: a quantidade de pontos ganhos e a quantidade de pontos perdidos. */

import java.util.Scanner;

public class ex05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entre com o nome da equipe: ");
    String equipe = scanner.nextLine();

    System.out.print("Entre com o número de vitórias: ");
    int vitorias = scanner.nextInt();

    System.out.print("Entre com o número de empates: ");
    int empates = scanner.nextInt();

    System.out.print("Entre com o número de derrotas: ");
    int derrotas = scanner.nextInt();

    int pontosGanhos = (vitorias * 3) + empates;
    int pontosPerdidos = (derrotas * 3) + (empates * 2);

    System.out.println("Equipe: " + equipe);
    System.out.println("Pontos ganhos: " + pontosGanhos);
    System.out.println("Pontos perdidos: " + pontosPerdidos);

    scanner.close();

  }
}
