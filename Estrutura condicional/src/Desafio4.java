import java.util.Scanner;

public class Desafio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Escolha o Codigo Do produto");
        IO.println("1- Cachorro Quente");
        IO.println("2- X-salada");
        IO.println("3- X-bacon");
        IO.println("4- Torrada Simples");
        IO.println("5- Refrigerante");
        IO.println("");
        int codigo = sc.nextInt();
        if (codigo == 1) {
            IO.println("Voce Escolheu cachorro quente o valor e R$ 4.00 Escolha a quantidade:");
            int quantidade = sc.nextInt();
            double valor = 4.00;
            double resultado = valor * quantidade;
            IO.println("Total a Pagar: " + resultado);
        } else if (codigo == 2) {
            IO.println("Voce Escolheu X-salada o valor e R$ 4.50 Escolha a quantidade:");
            int quantidade = sc.nextInt();
            double valor = 4.50;
            double resultado = valor * quantidade;
            IO.println("Total a Pagar: " + resultado);
            return;
        } else if (codigo == 3) {
            IO.println("Voce Escolheu X-bacon o valor e R$ 5.00 Escolha a quantidade:");
            int quantidade = sc.nextInt();
            double valor = 5.00;
            double resultado = valor * quantidade;
            IO.println("Total a Pagar: " + resultado);
            return;
        } else if (codigo == 4) {
            IO.println("Voce Escolheu Torrada Simples o valor e R$ 2.00 Escolha a quantidade:");
            int quantidade = sc.nextInt();
            double valor = 2.00;
            double resultado = valor * quantidade;
            IO.println("Total a Pagar: " + resultado);
            return;
        } else if (codigo == 5) {
            IO.println("Voce Refrigerante o valor e R$ 1.50 Escolha a quantidade:");
            int quantidade = sc.nextInt();
            double valor = 1.50;
            double resultado = valor * quantidade;
            IO.println("Total a Pagar: " + resultado);
            return;
        } else {
            IO.println("Codigo Inexistente");
        }
    }
}
