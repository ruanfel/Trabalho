package Exercicio6;

import java.util.ArrayList;
import java.util.List;

public class AgendaContato {
    public static class Contato {
        private String nome;
        private String telefone;

        public Contato(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
        }

        public String getNome() {
            return nome;
        }

        public String getTelefone() {
            return telefone;
        }
    }

    public static class Agenda {
        private List<Contato> contatos;

        public Agenda() {
            contatos = new ArrayList<>();
        }

        public void adicionarContato(Contato contato) {
            contatos.add(contato);
        }

        public Contato buscarContatoPorNome(String nome) {
            for (Contato contato : contatos) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    return contato;
                }
            }
            return null; // Retorna null se o contato não for encontrado
        }
    }
}