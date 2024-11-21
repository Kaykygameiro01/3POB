/* Elabore um programa usando listas que leia o nome e a nota de 10 alunos. 
Os dados devem ser armazenados em listas. O programa deve calcular a nota média da turma 
e ao final escrever: a nota média da turma e o nome e a nota dos alunos com resultados superiores à média. */
package exercicios4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Criando listas para armazenar os dados dos alunos
    ArrayList<String> nomes = new ArrayList<>();
    ArrayList<Double> notas = new ArrayList<>();
    int quantidadeAlunos = 10;

    // Entrada de dados para 10 alunos
    for (int i = 1; i <= quantidadeAlunos; i++) {
      System.out.print("Digite o nome do aluno " + i + ": ");
      String nome = sc.nextLine();
      nomes.add(nome);

      System.out.print("Digite a nota do aluno " + i + ": ");
      double nota = sc.nextDouble();
      notas.add(nota);

      sc.nextLine(); // Consumir a quebra de linha deixada pelo nextDouble
    }

    // Cálculo da média da turma
    double somaNotas = 0;
    for (double nota : notas) {
      somaNotas += nota;
    }
    double media = somaNotas / quantidadeAlunos;

    // Exibindo a nota média da turma
    System.out.printf("\nA nota média da turma é: %.2f\n", media);

    // Exibindo os alunos com notas superiores à média
    System.out.println("\nAlunos com notas superiores à média:");
    System.out.println("Nome\t\tNota");
    for (int i = 0; i < quantidadeAlunos; i++) {
      if (notas.get(i) > media) {
        System.out.println(nomes.get(i) + "\t\t" + String.format("%.2f", notas.get(i)));
      }
    }

    sc.close();
  }
}
