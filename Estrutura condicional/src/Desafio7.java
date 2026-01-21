import java.util.Locale;
import java.util.Scanner;

public class Desafio7 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x < 0 && y < 0) {
            IO.println("Voce Esta em Q3");
        }
        else if (x > 0 && y > 0) {
            IO.println("Voce Esta em Q1");
        }
        else if (x < 0 && y > 0) {
            IO.println("Voce Esta em Q2");
        }
        else if (x > 0 && y < 0) {
            IO.println("Voce Esta em Q4");
        }else{
            IO.println("Voce Esta Na origem");
        }




    }
}
