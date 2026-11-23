
package controlegastos.servico;

import controlegastos.excecoes.CategoriaNaoDefinidaException;
import controlegastos.excecoes.ControleGastosException;
import controlegastos.excecoes.NomeInvalidoOuNuloException;
import controlegastos.excecoes.ValorInvalidoException;
import controlegastos.modelo.Transacao;
import controlegastos.modelo.Receita;
import controlegastos.modelo.Despesa;

public class Validador {

    // Impede a criação de objetos desta classe utilitária
    private Validador() { }

    public static void validar(Transacao t) throws ControleGastosException {
        validarNomeDescricao(t);
        validarCategoria(t);
        validarValor(t);
    }

    // Verifica se o nome e a descrição são válidos
    private static void validarNomeDescricao(Transacao t)
            throws NomeInvalidoOuNuloException {

        if (textoVazio(t.getNome())) {
            throw new NomeInvalidoOuNuloException(
                    "O nome da transação não pode ser vazio ou nulo.");
        }

        if (textoVazio(t.getDescricao())) {
            throw new NomeInvalidoOuNuloException(
                    "A descrição da transação não pode ser vazia ou nula.");
        }
    }

    // Verifica se a categoria existe e corresponde ao tipo da transação
    private static void validarCategoria(Transacao t)
            throws CategoriaNaoDefinidaException {

        if (t.getCategoria() == null) {
            throw new CategoriaNaoDefinidaException(
                    "A transação precisa possuir uma categoria.");
        }

        if (t instanceof Receita &&
                t.getCategoria().getTipo() !=
                controlegastos.modelo.TipoTransacao.RECEITA) {

            throw new CategoriaNaoDefinidaException(
                    "Uma receita precisa possuir uma categoria de receita.");
        }

        if (t instanceof Despesa &&
                t.getCategoria().getTipo() !=
                controlegastos.modelo.TipoTransacao.DESPESA) {

            throw new CategoriaNaoDefinidaException(
                    "Uma despesa precisa possuir uma categoria de despesa.");
        }
    }

    // Verifica se o valor é positivo
    private static void validarValor(Transacao t)
            throws ValorInvalidoException {

        if (t.getValor() <= 0) {
            throw new ValorInvalidoException(
                    "O valor da transação deve ser maior que zero.");
        }
    }

    // Método auxiliar para verificar textos vazios
    static boolean textoVazio(String s) {
        return s == null || s.trim().isEmpty();
    }
}
