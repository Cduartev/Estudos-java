import java.util.Scanner;
public class entrada_de_dados {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        System.out.println("Voce digitou o numero: " + x);


        if (x <= 5) {
            IO.println("Voce reprovou");
            sc.close();
        } else
            IO.println("Voce nao reprovou");
        sc.close();
    }
    }

