import java.util.Locale;
import java.util.Scanner;
public class entrada_de_dados {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        int x;
        nome = sc.nextLine();
        x = sc.nextInt();
        if (x >= 7) {
            IO.println("Voce passou Parabens " + nome +" Sua nota: " + x);
            sc.close();
        } else
            IO.println("Voce nao passou "+ nome + " Sua nota: " + x );
        sc.close();
    }
    }
///  se o NEXT INT FOR PRIMEIRO QUE O NEXT LINE ELE CONSOME A QUEBRA DE LINHA SENAO ELE FICA COM UMA QUEBRA DE LINHA
///  PENDENTE ENTAO CUIDADO NA HORA DE FOR USAR ISSO
