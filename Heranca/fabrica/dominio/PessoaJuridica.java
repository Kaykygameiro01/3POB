package Heranca.fabrica.dominio;

public class PessoaJuridica extends Cliente {
    private String razaoSocial;
    private String cnpj;

    // Construtor
    public PessoaJuridica(String razaoSocial, String endereco, String telefone, String cnpj) {
        super(razaoSocial, endereco, telefone);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Pessoa Jurídica:");
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("CNPJ: " + cnpj);
    }
}