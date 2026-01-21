import java.util.Scanner;

public class Desafio1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero < 0){
            IO.println("O Seu numero e Negativo!");
            return;
        }else{
            IO.println("O Seu numero e Positivo!");
        }
    }
}
