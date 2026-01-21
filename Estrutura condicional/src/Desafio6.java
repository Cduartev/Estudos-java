import java.util.Locale;
import java.util.Scanner;

public class Desafio6 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num >= 0.00 && num <= 25.00) {
            IO.println("O seu intervalo e [0,25]");
            return;
        }
        if (num >= 25.00 && num <= 50.00) {
            IO.println("O seu intervalo e [25,50]");
            return;
        }
        if (num >= 50.00 && num <= 75.00) {
            IO.println("O seu intervalo e [50,75]");
            return;
        }
        if (num >= 75.00 && num <= 100.00) {
            IO.println("O seu intervalo e [75,100]");
            return;
        } else {
            IO.println("Fora Do Intervalo");
        }
    }
}

