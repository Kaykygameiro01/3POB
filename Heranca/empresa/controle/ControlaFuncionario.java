package Heranca.empresa.controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Heranca.empresa.dominio.Funcionario;
import Heranca.empresa.dominio.Gerente;
import Heranca.empresa.dominio.Vendas;

public class ControlaFuncionario {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Funcionario> funcionarios = new ArrayList<>();

            System.out.println("Sistema de Gerenciamento de Funcionários");
            System.out.println("------------------------------------------");

            boolean continuar = true;

            while (continuar) {
                System.out.println("\nEscolha o tipo de Funcionário:");
                System.out.println("1. Funcionário");
                System.out.println("2. Gerente");
                System.out.println("3. Vendas");
                System.out.println("4. Sair");
                System.out.print("Opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao == 1) {
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Salário: ");
                    float salario = scanner.nextFloat();

                    Funcionario f = new Funcionario(matricula, cpf, nome, salario);
                    funcionarios.add(f);

                } else if (opcao == 2) {
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Salário: ");
                    float salario = scanner.nextFloat();
                    System.out.print("Gratificação: ");
                    float gratificacao = scanner.nextFloat();

                    Gerente g = new Gerente(matricula, cpf, nome, salario, gratificacao);
                    funcionarios.add(g);

                } else if (opcao == 3) {
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Salário: ");
                    float salario = scanner.nextFloat();
                    System.out.print("Gratificação: ");
                    float gratificacao = scanner.nextFloat();
                    System.out.print("Participação nos Lucros: ");
                    float participacaoLucros = scanner.nextFloat();

                    Vendas v = new Vendas(matricula, cpf, nome, salario, gratificacao, participacaoLucros);
                    funcionarios.add(v);

                } else if (opcao == 4) {
                    continuar = false;
                } else {
                    System.out.println("Opção inválidaa. Tente novamente.");
                }
            }

            System.out.println("\nRelatório de Funcionários:");
            System.out.println("---------------------------");
            for (Funcionario f : funcionarios) {
                f.mostrarInfo();
                System.out.println();
            }
        }
    }
}
