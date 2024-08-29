/*Crie um programa para ler a matrícula e o
salário de dois empregados. Descontar 5% no salário do primeiro e acrescentar
9% no salário do segundo. Informar: o valor do desconto do primeiro; o valor do
acréscimo do segundo; o salário final do primeiro; o salário final do segundo.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex01{
    public static void main(String[] args) {
        
    Scanner leia = new Scanner(System.in); //variável leia que recebe dados
    DecimalFormat df = new DecimalFormat("0.00");//classe p formatação entre aspas é definido que será trabalhado com casas decimais

    System.out.print("Entre com a matrícula"); //como se fosse o printf
    int matricula1 = leia.nextInt(); //armazena a matricula
    System.out.print("Entre com o salário");
    double salario1 = leia.nextDouble();

    System.out.print("Entre com a matrícula");
    int matricula2 = leia.nextInt();
    System.out.print("Entre com o salário");
    double salario2 = leia.nextDouble();

    double desconto = salario1 * 0.05;
    double acrescimo = salario2 * 0.09;

    double salarioFinal1 = salario1 - desconto;
    double salarioFinal2 = salario2 + acrescimo;

    System.out.println("valor do desconto do primeiro empregado: " + df.fortmat(desconto));//ln = \n
    System.out.println("valor do aumento do segundo empregado: " + df.fortmat(acrescimo));
    System.out.println("Salário final do primeiro empregado: " + df.fortmat(salarioFinal1));
    System.out.println("Salário final do segundo empregado: " + df.fortmat(salarioFinal2));

    ;
} 
}

    