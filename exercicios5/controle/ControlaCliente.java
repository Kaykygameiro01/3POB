package exercicios5.controle;

    
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios5.dominio.Cliente;
import exercicios5.dominio.PessoaFisica;
import exercicios5.dominio.PessoaJuridica;

public class ControlaCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cliente> funcionarios = new ArrayList<>();

        System.out.println("Sistema de Gerenciamento de Clientes");
        System.out.println("----------------------------------------");

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha o tipo de Cliente:");
            System.out.println("1. Cliente Pessoa Física");
            System.out.println("2. Cliente Pessoa Jurídica");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Endereço: ");
                String endereco = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                

                PessoaFisica pf = new PessoaFisica(nome, endereco, telefone, cpf);
                funcionarios.add(pf);

            } else if (opcao == 2) {
                System.out.print("Razão Social: ");
                String razaoSocial = scanner.nextLine();
                System.out.print("Endereço: ");
                String endereco = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("CNPJ: ");
                String cnpj = scanner.nextLine();

                PessoaJuridica  = new PessoaJuridica(razaoSocial, endereco, telefone, cnpj);
                funcionarios.add(fh);

            } else if (opcao == 3) {
                continuar = false;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();

        System.out.println("\nRelatório de Funcionários:");
        System.out.println("--------------------------");
        for (Funcionario f : funcionarios) {
            f.mostrarInfo();
            System.out.println();
        }
    }
}