import java.util.Locale;

public class projeto_variaveis_java_aula_01 {
    static void main() {
        String produto1 = "Computador";
        String produto2 = "Teclado";

        int idade = 30;
        int codigo = 2020;
        char sexo = 'M';
        double preco1 = 2100.50;
        double preco2 = 650.50;
        double medida = 54.3213;
        IO.println("\n");
        System.out.println("Produtos: ");
        System.out.println("o Preco do " + produto1 + " e igual a " + preco1);
        System.out.println("O preco do " + produto2 + " e igual a " + preco2);

        IO.println("Registro: " + idade + " Anos, codigo " + codigo + " e Genero: " + sexo);

        IO.print("Codigo com 8 casas deciamais: ");
        System.out.printf("%.8f%n", medida);
        IO.print("COM 3 CASAS DECIMAIS: ");
        System.out.printf("%.3f%n", medida);
        IO.print("COM PONTOS DECIMAIS: ");
        Locale.setDefault(Locale.US);
        IO.print(medida);
    }
}

///  LOCALE SERVE PARA ADICIOAR OS PONTOS DECIMAIS DE ACORDO COM A LOCALIDADE

/// iniciar processamento de dados ////
