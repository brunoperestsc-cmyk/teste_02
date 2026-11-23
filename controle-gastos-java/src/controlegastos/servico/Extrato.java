package controlegastos.servico;

import controlegastos.modelo.Categoria;

import java.time.LocalDate;


public class Extrato {
    private final Conta conta;

    public Extrato(Conta conta) { this.conta = conta; }

    public void imprimir() {
        System.out.println("TODO (A): extrato completo de " + conta.getTitular().getNome());
    }

    public void imprimir(Categoria categoria) {
        System.out.println("TODO (A): extrato da categoria " + categoria);
    }

    public void imprimir(LocalDate inicio, LocalDate fim) {
        System.out.println("TODO (A): extrato de " + inicio + " a " + fim);
    }
}
