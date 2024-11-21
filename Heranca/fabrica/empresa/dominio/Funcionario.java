package Heranca.fabrica.empresa.dominio;

public class Funcionario {
  private String matricula;
  private String cpf;
  private String nome;
  private float salario;

  public Funcionario(String matricula, String cpf, String nome, float salario) {
    this.matricula = matricula;
    this.cpf = cpf;
    this.nome = nome;
    this.salario = salario;
  }

  public String getMatricula() {
    return matricula;
  }

  public String getCpf() {
    return cpf;
  }

  public String getNome() {
    return nome;
  }

  public float getSalario() {
    return salario;
  }

  public void mostrarInfo() {
    System.out.println("Matrícula: " + matricula);
    System.out.println("CPF: " + cpf);
    System.out.println("Nome: " + nome);
    System.out.println("Salário: R$ " + salario);
  }
}
