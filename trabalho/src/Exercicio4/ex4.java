package Exercicio4;

public class ex4 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Carlos", 0, 1);
        Jogador jogador2 = new Jogador("Maria", 100, 2);

        jogador1.aumentarPontuacao(50);
        jogador2.subirNivel();

        System.out.println("Informações do jogador 1:");
        jogador1.exibirInformacoes();

        System.out.println("\nInformações do jogador 2:");
        jogador2.exibirInformacoes();
    }
}
