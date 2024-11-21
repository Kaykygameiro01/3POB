package ArrayList.hospital.controle;

import ArrayList.hospital.dominio.Paciente;
import ArrayList.hospital.dominio.GerenciarPacientes;
import java.util.Scanner;

public class Controle {
  public static void main(String[] args) {
    GerenciarPacientes gerenciador = new GerenciarPacientes();
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
      System.out.println("\nMenu:");
      System.out.println("1. Incluir Paciente");
      System.out.println("2. Alterar Paciente");
      System.out.println("3. Excluir Paciente");
      System.out.println("4. Consultar Paciente");
      System.out.println("5. Listar Todos os Pacientes");
      System.out.println("0. Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Digite o número do paciente: ");
          int numero = scanner.nextInt();
          System.out.print("Digite o peso: ");
          double peso = scanner.nextDouble();
          System.out.print("Digite a altura: ");
          double altura = scanner.nextDouble();
          gerenciador.incluirPaciente(new Paciente(numero, peso, altura));
          break;
        case 2:
          System.out.print("Digite o número do paciente a ser alterado: ");
          int numAlterar = scanner.nextInt();
          System.out.print("Digite o novo peso: ");
          double novoPeso = scanner.nextDouble();
          System.out.print("Digite a nova altura: ");
          double novaAltura = scanner.nextDouble();
          gerenciador.alterarPaciente(numAlterar, novoPeso, novaAltura);
          break;
        case 3:
          System.out.print("Digite o número do paciente a ser excluído: ");
          int numExcluir = scanner.nextInt();
          gerenciador.excluirPaciente(numExcluir);
          break;
        case 4:
          System.out.print("Digite o número do paciente para consultar: ");
          int numConsultar = scanner.nextInt();
          gerenciador.consultarPaciente(numConsultar);
          break;
        case 5:
          gerenciador.listarTodosPacientes();
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida.");
      }
    } while (opcao != 0);

    scanner.close();
  }
}
