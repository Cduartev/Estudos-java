import java.util.Scanner;

public class Desafio2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            IO.println("O seu numero e Par");
        }else {
            IO.println("O seu numero e Impar");
        }
    }
}
