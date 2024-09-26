/*4.  Elabore um programa que leia o sexo de um número indeterminado de pessoas.
 Ao final escreva a quantidade de pessoas cadastradas e o total de pessoas  de cada sexo. */
package exercicios3;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, totalMasculino = 0, totalFeminino = 0;

        for (i = 0; i < 3; i++) {
            System.out.print("Entre com o sexo ('M' ou 'F'): ");
            char sexo = scanner.next().charAt(0);

            if (sexo == 'M') {
                totalMasculino += 1;
            } else {
                totalFeminino += 1;
            }
        }

        System.out.println("Quantidade de pessoas cadastradas: " + i);
        System.out.println("Quantidade de pessoas do sexo masculino: " + totalMasculino);
        System.out.println("Quantidade de pessoas do sexo feminino: " + totalFeminino);
        scanner.close();
    }

}
