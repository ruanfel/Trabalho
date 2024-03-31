package Exercicio8;

import Exercicio8.PedidoPizza.Pedido;
import Exercicio8.PedidoPizza.Pizza;

public class ex8 {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Margherita", 25.0, "Molho de tomate, queijo mussarela, manjericão");
        Pizza pizza2 = new Pizza("Calabresa", 30.0, "Molho de tomate, queijo mussarela, calabresa, cebola, azeitona");
        Pizza pizza3 = new Pizza("Frango com Catupiry", 35.0,
                "Molho de tomate, queijo mussarela, frango desfiado, catupiry");

        // Criando um novo pedido
        Pedido pedido = new Pedido();

        // Adicionando pizzas ao pedido
        pedido.adicionarPizza(pizza1);
        pedido.adicionarPizza(pizza2);
        pedido.adicionarPizza(pizza3);

        // Setando endereço de entrega
        pedido.setEnderecoEntrega("Rua Principal, 123");

        // Exibindo relatório do pedido
        pedido.exibirRelatorio();
    }
}
