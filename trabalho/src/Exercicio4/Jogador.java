package Exercicio4;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacaoInicial, int nivelInicial) {
        this.nome = nome;
        this.pontuacao = pontuacaoInicial;
        this.nivel = nivelInicial;
    }

    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            pontuacao += pontos;
            System.out.println("Pontuação aumentada para " + pontuacao);
        } else {
            System.out.println("A pontuação deve ser um valor positivo.");
        }
    }

    public void subirNivel() {
        nivel++;
        System.out.println("Jogador subiu para o nível " + nivel);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}
