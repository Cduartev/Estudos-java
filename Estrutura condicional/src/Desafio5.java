import java.util.Scanner;

public class Desafio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hi  = sc.nextInt();
        int hf= sc.nextInt();

        if (hf > hi) {
            int duracao = hf - hi;
            System.out.println("O JOGO DUROU: "+duracao+" HORA(S)");
            IO.println("caiu no if");
        } else{
            int duracao = 24 - hi + hf;
            System.out.println("O JOGO DUROU: "+duracao+" HORA(S)");
            IO.println("caiu no else");
        }

    }
}
