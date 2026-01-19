import java.util.Locale;
import java.util.Scanner;

public class desafio6 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double T = a *c /2;
        double C = 3.14159 * Math.pow(c,2) ;
        double TP = (a + b) * c /2 ;
        double Q = Math.pow(b,2) ;
        double R = a * b;

        IO.println("TRIANGULO: " + T);
        IO.println("CIRCULO: " + C);
        IO.println("TRAPESIO: " + TP);
        IO.println("QUADRADO: " + Q);
        IO.println("RETANGULO: " + R);



    }
}
