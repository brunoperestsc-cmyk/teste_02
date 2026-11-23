package controlegastos.app;

import controlegastos.modelo.Titular;
import controlegastos.servico.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(new Titular("Maria Souza"));
        System.out.println("Controle de Gastos - rascunho OK");
        System.out.println("Saldo inicial: " + conta.getSaldo());
    }
}
