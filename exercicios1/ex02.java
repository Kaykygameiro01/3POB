import java.util.Scanner;
import java.text.DecimalFormat;
public class ex02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Entre com o valor da temperatura em FARENHEIT: ");
        double F = leia.nextDouble();

        double C = 5.0/9.0 * (F - 32);

        System.out.println("O valor em graus celsius é: " + df.format(C));
        
    }
}


/* Faça um programa que dado o valor da
temperatura em graus FARENHEIT, calcular e escrever o valor da temperatura em
graus CELSIUS.


Fórmula: C = 5/9 * (F - 32)
 */