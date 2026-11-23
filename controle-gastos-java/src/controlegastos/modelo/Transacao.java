
package controlegastos.modelo;

import java.time.LocalDate;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Transacao {

    private static long proximoId = 1;

    protected long id;
    protected String nome;
    protected String descricao;
    protected double valor;
    protected LocalDate data;
    protected Categoria categoria;

    public Transacao(String nome, String descricao, double valor,
                     LocalDate data, Categoria categoria) {

        this.id = proximoId++;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
    }

    public abstract double getEfeito();

    public static String formatarValor(double valor) {
        NumberFormat formato = NumberFormat.getNumberInstance(
                Locale.forLanguageTag("pt-BR"));

        formato.setMinimumFractionDigits(2);
        formato.setMaximumFractionDigits(2);

        return formato.format(valor);
    }

    @Override
    public String toString() {
        String efeito = getEfeito() >= 0 ? "+" : "";

        return String.format(
                "ID: %d | Tipo: %s | Nome: %s | Categoria: %s | Valor: %s%s | Data: %s | Descrição: %s",
                id,
                getClass().getSimpleName().toUpperCase(),
                nome,
                categoria,
                efeito,
                formatarValor(getEfeito()),
                data,
                descricao
        );
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
