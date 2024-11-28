package controller;

import model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            funcionarios.forEach(func -> System.out.println(func.mostrarDetalhes()));
        }
    }

    public Funcionario buscarFuncionario(String nome) {
        for (Funcionario func : funcionarios) {
            if (func.getNome().equalsIgnoreCase(nome)) {
                return func;
            }
        }
        return null;
    }

    public boolean excluirFuncionario(String nome) {
        Funcionario func = buscarFuncionario(nome);
        if (func != null) {
            funcionarios.remove(func);
            return true;
        }
        return false;
    }
}
