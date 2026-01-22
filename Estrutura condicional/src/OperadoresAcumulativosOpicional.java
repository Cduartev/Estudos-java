import java.util.Locale;
import java.util.Scanner;

public class OperadoresAcumulativosOpicional {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();

        double conta = 50.0;
        if (min > 100) {
            conta += (min - 100) * 2.00;
        }
            IO.print(String.format("Valor da Conta = R$ %.2f", conta));
    }
}
