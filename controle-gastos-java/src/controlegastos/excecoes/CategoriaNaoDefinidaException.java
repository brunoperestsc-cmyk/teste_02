package controlegastos.excecoes;

public class CategoriaNaoDefinidaException extends ControleGastosException {
    public CategoriaNaoDefinidaException(String mensagem) {
        super(mensagem);
    }
}
