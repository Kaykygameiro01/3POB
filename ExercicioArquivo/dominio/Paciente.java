package ExercicioArquivo.dominio;

public class Paciente {
    private int numero;
    private double peso;
    private double altura;

    public Paciente(int numero, double peso, double altura) {
        this.numero = numero;
        this.peso = peso;
        this.altura = altura;
    }

    public int getNumero() {
        return numero;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toFileString() {
        return numero + "," + peso + "," + altura;
    }

    public static Paciente fromFileString(String line) {
        String[] data = line.split(",");
        return new Paciente(Integer.parseInt(data[0]), Double.parseDouble(data[1]), Double.parseDouble(data[2]));
    }

    public void listarPaciente() {
        System.out.println("Número: " + numero);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }
}
