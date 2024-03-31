package Exercicio8;

import java.util.ArrayList;
import java.util.List;

public class PedidoPizza {
    public static class Pedido {
        private static int totalPedidos = 0;
        private static double totalValorPedidos = 0.0;
        private List<Pizza> pizzas;
        private String enderecoEntrega;

        public Pedido() {
            pizzas = new ArrayList<>();
        }

        public void adicionarPizza(Pizza pizza) {
            pizzas.add(pizza);
            totalPedidos++;
            totalValorPedidos += pizza.getValor();
        }

        public void cancelarPedido() {
            pizzas.clear();
        }

        public void setEnderecoEntrega(String enderecoEntrega) {
            this.enderecoEntrega = enderecoEntrega;
        }

        public String getEnderecoEntrega() {
            return enderecoEntrega;
        }

        public static int getTotalPedidos() {
            return totalPedidos;
        }

        public static double getTotalValorPedidos() {
            return totalValorPedidos;
        }

        public static double getMediaValorPedidos() {
            return totalValorPedidos / totalPedidos;
        }

        public void exibirRelatorio() {
            System.out.println("Relatório de Pedidos:");
            System.out.println("Total de Pedidos: " + totalPedidos);
            System.out.println("Total de Valor dos Pedidos: R$" + totalValorPedidos);
            System.out.println("Média de Valor dos Pedidos: R$" + getMediaValorPedidos());
        }
    }

    public static class Pizza {
        Pizza pizza1 = new Pizza("Margherita", 25.0, "Molho de tomate, queijo mussarela, manjericão");
        Pizza pizza2 = new Pizza("Calabresa", 30.0, "Molho de tomate, queijo mussarela, calabresa, cebola, azeitona");
        Pizza pizza3 = new Pizza("Frango com Catupiry", 35.0, "Molho de tomate, queijo mussarela, frango desfiado, catupiry");

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