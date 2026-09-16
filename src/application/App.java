package application;

import entities.ContaCorrente;

public class App {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("Mateus", "Santos", 123456789);
        conta.depositar(100);
        conta.sacar(125);
        conta.rendimento();
        conta.exibirSaldo();
    }
}
