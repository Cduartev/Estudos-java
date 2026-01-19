import java.util.Scanner;

public class Desafio3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int diferenca = a * b - c * d;
        IO.println(diferenca);

    }
}