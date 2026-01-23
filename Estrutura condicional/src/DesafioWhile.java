import java.util.Scanner;

public class DesafioWhile {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite Sua Senha:");
        int senha = sc.nextInt();

        while (senha != 2002){
            IO.println("Senha incorreta digite novamente:");
            senha = sc.nextInt();
        }
        if (senha == 2002){
            IO.println("Bem vindo ao Sistema");
        }
        sc.close();


    }
}
