package Exercicio1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite numero 1: ");
        float a = scanner.nextFloat();

        System.out.println("Digite numero 2: ");
        float b = scanner.nextFloat();

        System.out.println("Escolha a operação desejada: ");
        System.out.println("[1] Adição");
        System.out.println("[2] Subitração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");

        int escolha = scanner.nextInt();
        float resultado = 0;

        switch (escolha) {
            case 1:
                resultado = Calculadora.Somar(a, b);
                System.out.println("Resultado da Adição: " + resultado);
                break;
            case 2:
                resultado = Calculadora.Subtrair(a, b);
                System.out.println("Resultado da Adição: " + resultado);
                break;
            case 3:
                resultado = Calculadora.Multiplicar(a, b);
                System.out.println("Resultado da Adição: " + resultado);
                break;
            case 4:
                resultado = Calculadora.dividir(a, b);
                System.out.println("Resultado da Adição: " + resultado);
                break;

            default:
                break;
        }

    }

}