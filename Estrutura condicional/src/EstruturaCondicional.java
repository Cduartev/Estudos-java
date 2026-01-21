import java.util.Scanner;

public class EstruturaCondicional {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CodTrabalho;
        CodTrabalho = sc.nextInt();

        if (CodTrabalho == 1) {
            IO.println("Bem vindo Voce e o novo contratado da empresa");
            return;
        }
        if (CodTrabalho == 2) {
            IO.println("Parabens Voce e o novo gerente ");
            return;
        }
        if (CodTrabalho == 3) {
            IO.println("Voce nao esta contratado");
            return;
        } else {
            IO.println("Codigo Nao cadastrado");
        }


    }

}
