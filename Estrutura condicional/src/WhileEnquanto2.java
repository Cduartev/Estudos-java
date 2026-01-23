import java.util.Scanner;

public class WhileEnquanto2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite 2 numeros para somar ele nao pode dar mais que 5 essa soma");
        int valor = sc.nextInt();
        int valor2 = sc.nextInt();
        int resultado = valor + valor2;
        while (resultado > 5) {
            IO.println("O RESULTADO NAO PODE SER MAIOR QUE 5");
            valor = sc.nextInt();
            valor2 = sc.nextInt();
            resultado = valor + valor2;
        }

        sc.close();
    }
}
