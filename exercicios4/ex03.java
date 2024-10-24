package exercicios4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Listas para armazenar os dados
    ArrayList<String> nomes = new ArrayList<>();
    ArrayList<String> telefones = new ArrayList<>();
    ArrayList<Integer> codigos = new ArrayList<>();

    // Leitura dos dados de 100 pessoas
    for (int i = 1; i <= 4; i++) {
      System.out.print("Digite o nome da pessoa " + i + ": ");
      String nome = sc.next();
      nomes.add(nome);

      System.out.print("Digite o telefone de " + nome + ": ");
      String telefone = sc.next(); // Alterado para String para aceitar telefones com traços ou espaços
      telefones.add(telefone);

      System.out.print("Digite o código de " + nome + ": ");
      int codigo = sc.nextInt();
      codigos.add(codigo);
    }

    // Variável de controle para continuar ou não as consultas
    String continuar = "S";

    // Loop para consultas por código
    while (continuar.equals("S")) {
      System.out.print("Digite o código da pessoa que deseja consultar: ");
      int codigoConsulta = sc.nextInt();

      // Verifica se o código existe na lista
      if (codigos.contains(codigoConsulta)) {
        int index = codigos.indexOf(codigoConsulta);
        System.out.println("Código: " + codigos.get(index));
        System.out.println("Nome: " + nomes.get(index));
        System.out.println("Telefone: " + telefones.get(index));
      } else {
        System.out.println("Código não encontrado.");
      }

      System.out.print("Deseja consultar outra pessoa? (S para sim, N para não): ");
      continuar = sc.next().toUpperCase();
    }

    sc.close(); // Fecha o scanner
  }
}
