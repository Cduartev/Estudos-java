import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        do {
            System.out.println("OI");
            System.out.println("Vamos executar o do-while");
            a = sc.nextInt();
        } while (a == 1);

        sc.close();
    }
}
