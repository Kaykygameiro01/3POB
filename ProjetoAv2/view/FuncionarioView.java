package view;

import model.*;
import controller.FuncionarioController;

import java.util.Scanner;

public class FuncionarioView {
    private FuncionarioController controller = new FuncionarioController();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        int opcao;

        do {
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Buscar Funcionário");
            System.out.println("4. Excluir Funcionário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir a quebra de linha

            switch (opcao) {
                case 1 -> cadastrarFuncionario();
                case 2 -> controller.listarFuncionarios();
                case 3 -> buscarFuncionario();
                case 4 -> excluirFuncionario();
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }

    private void cadastrarFuncionario() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // consumir a quebra de linha

        System.out
                .println("Tipo de funcionário (1: Desenvolvedor, 2: Gerente, 3: Treinador, 4: GerenteDesenvolvedor): ");
        int tipo = scanner.nextInt();

        Funcionario funcionario = switch (tipo) {
            case 1 -> new Desenvolvedor(nome, salario);
            case 2 -> new Gerente(nome, salario);
            case 3 -> new Treinador(nome, salario);
            case 4 -> new GerenteDesenvolvedor(nome, salario);
            default -> null;
        };

        if (funcionario != null) {
            controller.adicionarFuncionario(funcionario);
            System.out.println("Funcionário cadastrado com sucesso!");
        } else {
            System.out.println("Tipo inválido!");
        }
    }

    private void buscarFuncionario() {
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        Funcionario func = controller.buscarFuncionario(nome);
        if (func != null) {
            System.out.println(func.mostrarDetalhes());
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private void excluirFuncionario() {
        System.out.print("Digite o nome do funcionário para exclusão: ");
        String nome = scanner.nextLine();
        if (controller.excluirFuncionario(nome)) {
            System.out.println("Funcionário excluído com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
