package Exercicio2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("~~~~~~~ Bem Vindo a Biblioteca!! ~~~~~~~");
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Consultar Livro");
            System.out.println("0. Sair..... Volte sempre!!!!");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    biblioteca.adicionarLivro(scanner);
                case 2:
                    biblioteca.consultarLivro(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
