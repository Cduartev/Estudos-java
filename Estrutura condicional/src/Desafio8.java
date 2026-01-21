import java.util.Scanner;

public class Desafio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();

        double imposto = 0.0;

        if (salario <= 2000.00) {
            IO.println("Isento");
            return;
        }

        if (salario > 2000.00) {
            double faixa = Math.min(salario, 3000.00) - 2000.00;
            imposto += faixa * 0.08;
        }

        if (salario > 3000.00) {
            double faixa = Math.min(salario, 4500.00) - 3000.00;
            imposto += faixa * 0.18;
        }

        if (salario > 4500.00) {
            double faixa = salario - 4500.00;
            imposto += faixa * 0.28;
        }

        IO.println(String.format("R$ %.2f", imposto));
    }
}
