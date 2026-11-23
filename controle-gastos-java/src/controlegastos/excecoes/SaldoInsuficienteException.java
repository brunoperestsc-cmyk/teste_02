package controlegastos.excecoes;

public class SaldoInsuficienteException extends ControleGastosException {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
