import java.util.Scanner;

public class WhileEnquanto {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("DIGITE O VALOR QUE VOCE DESEJA RECEBER:");
        int v = sc.nextInt();

        while (v > 1000) {
            IO.println("Seu salario Nao Pode ser maior que 1000 nao temos esse valor");
             v = sc.nextInt();
        }
















        sc.close();
    }
}
