import java.util.Scanner;

public class Ternarios {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        String teste = (valor == 1 ) ? "Ele e o cayo" : "Quem e esse cara?";
        IO.println(teste);

    }
}
