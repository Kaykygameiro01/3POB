/*11. Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a massa inicial, em gramas, fazer um algoritmo que determine o tempo necessário para que essa massa se torne menor do que 0.5 gramas. Escreva a massa final, e o tempo. Observação: o usuário deve digitar a massa inicial. */
package exercicios3;

import java.util.Scanner;

public class ex11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int tempo = 0;
    double massa;

    System.out.print("Entre com a massa incial: ");
    massa = scanner.nextDouble();

    double massaInicial = massa;

    while (massa > 0.5) {
      massa = massa / 2;
      tempo += 50;
    }

    double massaFinal = massa;

    System.out.println("massa incial: " + massaInicial);
    System.out.println("massa final: " + massa);
    System.out.println("tempo: " + tempo);

  }
}

/*
 * a cada 50 segundos o material perde metade da massa, calcular quanto tempo
 * demoraria para a massa se tornar menor que 0.5 gramas
 */