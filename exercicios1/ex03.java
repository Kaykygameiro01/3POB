import java.text.DecimalFormat;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Entre com o código da turma ");
        int codigo = scanner.nextInt();

        System.out.print("Entre com a quantidade de alunos aprovados: ");
        int aprovados = scanner.nextInt();

        System.out.print("Entre com a quantidade de alunos do sexo masculino: ");
        int masculino = scanner.nextInt();

        System.out.print("Entre com a quantidade de alunos do sexo feminino: ");
        int feminino = scanner.nextInt();

        int totalAlunos = masculino + feminino;
        int reprovados = totalAlunos - aprovados;

        double porcentagemReprovados = (reprovados * 100.0) / totalAlunos;
        double porcentagemMasculino = (masculino * 100.0) / totalAlunos;
        double porcentagemFeminino = (feminino * 100.0) / totalAlunos;

        System.out.println("A quantidade de alunos é: " + totalAlunos);

        System.out.println("A porcentagem de alunos do sexo feminino é: " + df.format(porcentagemFeminino) + "%");

        System.out.println("A porcentagem de alunos do sexo masculino é: " + df.format(porcentagemMasculino) + "%");

        System.out.println("A porcentagem de alunos reprovados é : " + df.format(porcentagemReprovados) + "%");

    }
}

/*
 * 3. Faça um programa para solicitar o código, a
 * quantidade de alunos do sexo masculino, a quantidade de alunos do sexo
 * feminino
 * e a quantidade de alunos aprovados de uma determinada turma.
 * 
 * 
 * Calcular e informar: a
 * porcentagem de alunos do sexo masculino; a porcentagem de alunos do sexo
 * feminino; a porcentagem de alunos reprovados; o total de alunos da turma.
 */