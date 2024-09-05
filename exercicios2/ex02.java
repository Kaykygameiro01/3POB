/*Crie um programa para solicitar o ano atual e o ano de nascimento de uma pessoa. Calcular sua idade aproximada e informá-la. Se sua idade for inferior a 16 anos, escrever a mensagem "Não pode votar"; caso contrário, emitir a mensagem "É eleitor". */

package exercicios2;

import java.util.Scanner;

public class ex02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entre com o ano atual: ");
    int anoAtual = scanner.nextInt();
    System.out.print("Entre com o seu ano de nascimento: ");
    int anoNascimento = scanner.nextInt();

    int idade = anoAtual - anoNascimento;

    if (idade < 16) {
      System.out.print("não pode votar");
    } else {
      System.out.print("é eleitor");
    }
  }
}
