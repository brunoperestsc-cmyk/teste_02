
package controlegastos.modelo;

import java.time.LocalDate;

public class Despesa extends Transacao {

    public Despesa(String nome, String descricao, double valor,
                   LocalDate data, Categoria categoria) {

        super(nome, descricao, valor, data, categoria);
    }

    // Sobrescrita: despesa diminui o saldo
    @Override
    public double getEfeito() {
        return -valor;
    }
}
