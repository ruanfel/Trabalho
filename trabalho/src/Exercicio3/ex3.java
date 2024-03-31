package Exercicio3;

public class ex3 {
    public static void main(String[] args) {
        // Criando uma conta bancária
        ContaBancaria conta = new ContaBancaria(12345, "João", 1000.0);

        // Realizando algumas operações
        conta.depositar(500.0);
        conta.sacar(200.0);

        // Consultando o saldo atual
        double saldoAtual = conta.consultarSaldo();
        System.out.println("Saldo atual da conta: R$" + saldoAtual);
    }
}
