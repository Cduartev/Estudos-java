import java.util.Scanner;

public class Desafio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Codigo da peca 1:");
        int peca1 = sc.nextInt();
        IO.println("Valor da peca 1:");
        double valor1 = sc.nextDouble();
        IO.println("Quantidade da peca 1:");
        int qtd1 = sc.nextInt();


        IO.println("Codigo da peca 2:");
        int peca2 = sc.nextInt();
        IO.println("Valor da peca 2:");
        double valor2 = sc.nextDouble();
        IO.println("Quantidade da peca 2:");
        int qtd2 = sc.nextInt();

        double resultado = valor1 * qtd1 + valor2 * qtd2;


        IO.println("VALOR A PAGAR: " + resultado);

    }
}
