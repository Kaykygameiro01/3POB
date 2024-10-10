package exercicios5.dominio;

public abstract class Cliente {
    protected String endereco;
    protected String telefone;
    protected String nome;


    public Cliente(String endereco, String telefone){
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public void mostrarInfo() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: R$ " + telefone);

}
}



    










