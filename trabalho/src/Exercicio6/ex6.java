package Exercicio6;

import Exercicio6.AgendaContato.Agenda;
import Exercicio6.AgendaContato.Contato;

public class ex6 {
    public static void main(String[] args) {
        // Exemplo de uso das classes Contato e Agenda
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("João", "123456789");
        Contato contato2 = new Contato("Maria", "987654321");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        Contato contatoEncontrado = agenda.buscarContatoPorNome("Maria");
        if (contatoEncontrado != null) {
            System.out.println(
                    "Contato encontrado: " + contatoEncontrado.getNome() + ", " + contatoEncontrado.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}
