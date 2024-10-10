package exercicios5.dominio;

public class PessoaJuridica extends Cliente {
    
    public PessoaJuridica(String razaoSocial, double cnpj) {
        
        super(razaoSocial,cnpj);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return razaoSocial;
    }

    public double getCnpj() {
        return cnpj;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("razaoSocial: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
    }
}