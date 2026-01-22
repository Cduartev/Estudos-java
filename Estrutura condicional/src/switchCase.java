import java.util.Scanner;

public class switchCase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                IO.print("Segunda");
                break;
            case 2:
                IO.print("Terca");
                break;
            case 3:
                IO.print("Quarta");
                break;
            case 4:
                IO.print("Quinta");
                break;
            case 5:
                IO.print("Sexta");
                break;
            case 6:
                IO.print("Sabado");
                break;
            case 7:
                IO.print("Domingo");
                break;
            default:
                IO.print("Comando invalido");
                break;

        }

    }
}
