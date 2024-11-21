package ExercicioArquivo.dominio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciarPacientes {
  private final String arquivo = "ExercicioArquivo/dominio/pacientes.txt";

  public void incluirPaciente(Paciente paciente) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
      writer.write(paciente.toFileString());
      writer.newLine();
      System.out.println("Paciente incluído com sucesso!");
    } catch (IOException e) {
      System.out.println("Erro ao incluir paciente: " + e.getMessage());
    }
  }

  public void alterarPaciente(int numero, double novoPeso, double novaAltura) {
    List<Paciente> pacientes = listarTodosPacientes();
    boolean encontrado = false;

    for (Paciente p : pacientes) {
      if (p.getNumero() == numero) {
        p.setPeso(novoPeso);
        p.setAltura(novaAltura);
        encontrado = true;
        break;
      }
    }

    if (encontrado) {
      salvarPacientes(pacientes);
      System.out.println("Paciente alterado com sucesso!");
    } else {
      System.out.println("Paciente não encontrado.");
    }
  }

  public void excluirPaciente(int numero) {
    List<Paciente> pacientes = listarTodosPacientes();
    Paciente pacienteARemover = null;

    for (Paciente p : pacientes) {
      if (p.getNumero() == numero) {
        pacienteARemover = p;
        break;
      }
    }

    if (pacienteARemover != null) {
      pacientes.remove(pacienteARemover);
      salvarPacientes(pacientes);
      System.out.println("Paciente excluído com sucesso!");
    } else {
      System.out.println("Paciente não encontrado.");
    }
  }

  public void consultarPaciente(int numero) {
    List<Paciente> pacientes = listarTodosPacientes();
    for (Paciente p : pacientes) {
      if (p.getNumero() == numero) {
        p.listarPaciente();
        return;
      }
    }
    System.out.println("Paciente não encontrado.");
  }

  public List<Paciente> listarTodosPacientes() {
    List<Paciente> pacientes = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
      String line;
      while ((line = reader.readLine()) != null) {
        pacientes.add(Paciente.fromFileString(line));
      }
    } catch (IOException e) {
      System.out.println("Erro ao ler o arquivo: " + e.getMessage());
    }
    return pacientes;
  }

  private void salvarPacientes(List<Paciente> pacientes) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
      for (Paciente p : pacientes) {
        writer.write(p.toFileString());
        writer.newLine();
      }
    } catch (IOException e) {
      System.out.println("Erro ao salvar os pacientes: " + e.getMessage());
    }
  }
}
