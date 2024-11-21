package ArrayList.hospital.dominio;

import java.util.ArrayList;
import java.util.List;

public class GerenciarPacientes {
  private List<Paciente> pacientes = new ArrayList<>();

  public void incluirPaciente(Paciente paciente) {
    pacientes.add(paciente);
    System.out.println("Paciente incluído com sucesso!");
  }

  public void alterarPaciente(int numero, double novoPeso, double novaAltura) {
    for (Paciente p : pacientes) {
      if (p.getNumero() == numero) {
        p.setPeso(novoPeso);
        p.setAltura(novaAltura);
        System.out.println("Paciente alterado com sucesso!");
        return;
      }
    }
    System.out.println("Paciente não encontrado.");
  }

  public void excluirPaciente(int numero) {
    Paciente pacienteARemover = null;
    for (Paciente p : pacientes) {
      if (p.getNumero() == numero) {
        pacienteARemover = p;
        break;
      }
    }
    if (pacienteARemover != null) {
      pacientes.remove(pacienteARemover);
      System.out.println("Paciente excluído com sucesso!");
    } else {
      System.out.println("Paciente não encontrado.");
    }
  }

  public void consultarPaciente(int numero) {
    for (Paciente p : pacientes) {
      if (p.getNumero() == numero) {
        p.listarPaciente();
        return;
      }
    }
    System.out.println("Paciente não encontrado.");
  }

  public void listarTodosPacientes() {
    if (pacientes.isEmpty()) {
      System.out.println("Nenhum paciente cadastrado.");
    } else {
      System.out.println("\nLista de Pacientes:");
      for (Paciente p : pacientes) {
        p.listarPaciente();
      }
    }
  }
}
