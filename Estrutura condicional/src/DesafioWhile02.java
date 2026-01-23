import java.util.Scanner;

public class DesafioWhile02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.println("Que tipo de Gasolina voce vai querer?");
        IO.println("1-Gasolina Comum");
        IO.println("2-Alcool");
        IO.println("3-Diesel");
        IO.println("4-Sair Do Sistema");

        int valor = sc.nextInt();

        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        while (valor != 4) {

            if (valor == 1) {
                gasolina = gasolina + 1;
            }
            else if (valor == 2) {
                alcool = alcool + 1;
            }
            else if (valor == 3) {
                diesel = diesel + 1;

            } else if (valor != 1 && valor != 2 && valor != 3) {
                IO.println("Valor Invalido Digite novamente. ");

            }



            IO.println("Sua Quantidade Atual e:");
            IO.println("Gasolina: " + gasolina);
            IO.println("Alcool: " + alcool);
            IO.println("Disiel: " + diesel);

            valor = sc.nextInt();
            if (valor == 4) {
                IO.println("Muito Obrigado!");
            }
            sc.close();
        }
    }
}
