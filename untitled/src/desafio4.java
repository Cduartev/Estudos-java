import java.util.Scanner;

public class desafio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Seu numero:");
        int numero = sc.nextInt();
        System.out.println("Digite as suas horas trabalhadas:");
        double hora = sc.nextDouble();
        System.out.println("Digite quanto voce vai ganhar por horas ex: 10 reais por hora");
        double salario = sc.nextDouble();
        double resultado = salario * hora;
        IO.println(" Trabalhador numero:");
        IO.println(numero);
        System.out.println("O Seu salario:");
        IO.println(resultado);


    }
}
