import java.util.Locale;

public class variavies_java_aula_1 {
    static void main() {
        int idade = 25;
        double altura = 1.744444;
        char sexo = 'M';
        boolean ativo = true;
        String nome = "Cayo";

        Locale.setDefault(Locale.US);
        IO.println("A sua idade e " + idade);
        System.out.printf("Sua altura %.2f%n", altura);
        System.out.println("O seu sexo e " + sexo);
        IO.println("Usuario Ativo? " + ativo);
        IO.println(nome);

        System.out.println();


    }
}
/// testando usando o java 25 e java 20 testando as funcionalidades
/// Aqui voce vai ver os tipos de variaveis INT DUBLE CHAR BOOLEAN STRING ISSO DAQUI E O BASICO DO BASICO
/// AQUI PODE APLICAR O PADRAO CAMEL CASE TAMBEM CASO VOCE QUEIRA
/// LOCALE E PARA DEFINIR O LOCAL DEFAULT US PARA TER PONTO NAS