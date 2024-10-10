package exercicios5.dominio;

public class PessoaFisica extends Cliente {
    
    public PessoaFisica( String cpf, String nome) {

        super(nome,cpf);
     

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
