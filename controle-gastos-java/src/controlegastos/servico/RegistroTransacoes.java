package controlegastos.servico;

import controlegastos.excecoes.ControleGastosException;
import controlegastos.modelo.Transacao;

public interface RegistroTransacoes {
    void inserir(Transacao t) throws ControleGastosException;
    void atualizar(int id, Transacao nova) throws ControleGastosException;
    void remover(int id) throws ControleGastosException;
    double getSaldo();
}
