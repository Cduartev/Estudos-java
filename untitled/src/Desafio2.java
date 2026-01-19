import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        double t = 3.14159;
        double numero;
        numero = sc.nextDouble();
        double resultado = t * Math.pow(numero, 2);
        System.out.println("O resultado e:");
        System.out.printf("%.4f",resultado);
        return;
    }
}
