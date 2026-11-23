package controlegastos.servico;

import controlegastos.excecoes.ControleGastosException;
import controlegastos.excecoes.SaldoInsuficienteException;
import controlegastos.modelo.Titular;
import controlegastos.modelo.Transacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conta implements RegistroTransacoes, Imprimivel {
    private final Titular titular;
    private final List<Transacao> transacoes = new ArrayList<>(); // POLIMORFISMO DE INCLUSÃO
    private double saldo = 0.0;

    public Conta(Titular titular) { this.titular = titular; }

    public Titular getTitular() { return titular; }

    public List<Transacao> getTransacoes() {
        return Collections.unmodifiableList(transacoes);
    }

    @Override
    public void inserir(Transacao t) throws ControleGastosException {
        throw new UnsupportedOperationException("TODO (B): inserir");
    }

    @Override
    public void atualizar(int id, Transacao nova) throws ControleGastosException {
        throw new UnsupportedOperationException("TODO (B): atualizar");
    }

    @Override
    public void remover(int id) throws ControleGastosException {
        throw new UnsupportedOperationException("TODO (B): remover");
    }

    @Override
    public double getSaldo() { return saldo; }

    @Override
    public void imprimirExtrato() {
        new Extrato(this).imprimir();
    }

    private void verificarSaldo(double novoSaldo) throws SaldoInsuficienteException {
    }
}
