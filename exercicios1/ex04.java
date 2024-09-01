
/*   O camelô Zé da banca vende diariamente, games, calculadoras e canetas. Faça um programa para solicitar o total de
games, o total de calculadoras   e o  total de canetas vendidas ao término do dia. O programa deve solicitar também o
preço de cada um dos produtos e ao final calcular e informar o total do faturamento com cada produto e o faturamento total.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.print("Entre com o total de games vendidos: ");
    int games = scanner.nextInt();
    System.out.print("Entre com o preço de cada game ");
    double precoGame = scanner.nextDouble();

    System.out.print("Entre com o total de calculadoras vendidas: ");
    int calculadoras = scanner.nextInt();
    System.out.print("Entre com o preço de cada calculadora ");
    double precoCalculadora = scanner.nextDouble();

    System.out.print("Entre com o total de canetas vendidas: ");
    int canetas = scanner.nextInt();
    System.out.print("Entre com o preço de cada caneta ");
    double precoCaneta = scanner.nextDouble();

    double faturamentoGames = games * precoGame;
    double faturamentoCalculadora = calculadoras * precoCalculadora;
    double faturamentoCanetas = canetas * precoCaneta;

    double faturamentoTotal = faturamentoGames + faturamentoCalculadora + faturamentoCanetas;

    System.out.println("Faturamento com games: R$ " + df.format(faturamentoGames));
    System.out.println("Faturamento com calculadoras: R$ " + df.format(faturamentoCalculadora));
    System.out.println("Faturamento com canetas: R$ " + df.format(faturamentoCanetas));
    System.out.println("Faturamento total: R$ " + df.format(faturamentoTotal));

  }
}
