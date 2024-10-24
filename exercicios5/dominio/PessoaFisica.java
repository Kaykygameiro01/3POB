package exercicios5.dominio;

public class PessoaFisica extends Cliente {
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("CPF: " + cpf);
    }
}
