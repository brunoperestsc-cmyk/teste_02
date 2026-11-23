
package controlegastos.modelo;

import java.time.LocalDate;

public class Receita extends Transacao {

    public Receita(String nome, String descricao, double valor,
                   LocalDate data, Categoria categoria) {

        super(nome, descricao, valor, data, categoria);
    }

    // Sobrescrita: receita aumenta o saldo
    @Override
    public double getEfeito() {
        return valor;
    }
}
