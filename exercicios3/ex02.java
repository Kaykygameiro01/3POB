
/*2.  Faça um programa que calcule e escreva no vídeo o somatório dos números inteiros de 1 até 50. */
package exercicios3;

public class ex02 {
  public static void main(String[] args) {
    int i;
    int somatorio = 0;

    for (i = 0; i < 50; i++) {
      somatorio += i;
    }

    System.out.print("o somatório é  " + somatorio);

  }
}
