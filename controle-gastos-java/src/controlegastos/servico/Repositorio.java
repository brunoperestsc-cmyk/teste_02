package controlegastos.servico;

import controlegastos.modelo.Transacao;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<T extends Transacao> {
    private final List<T> itens = new ArrayList<>();

    public void adicionar(T item) {
        throw new UnsupportedOperationException("TODO (A)");
    }

    public T buscarPorId(int id) {
        throw new UnsupportedOperationException("TODO (A)");
    }

    public void remover(int id) {
        throw new UnsupportedOperationException("TODO (A)");
    }

    public List<T> listar() {
        return new ArrayList<>(itens);
    }
}
