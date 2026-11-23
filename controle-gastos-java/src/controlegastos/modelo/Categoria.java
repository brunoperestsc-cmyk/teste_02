package controlegastos.modelo;

public enum Categoria {
    SALARIOS(TipoTransacao.RECEITA, "Salários"),
    HONORARIOS(TipoTransacao.RECEITA, "Honorários"),
    RENDIMENTOS(TipoTransacao.RECEITA, "Rendimentos"),
    OUTRAS_RECEITAS(TipoTransacao.RECEITA, "Outras receitas"),
    MORADIA(TipoTransacao.DESPESA, "Moradia"),
    LUZ(TipoTransacao.DESPESA, "Luz"),
    AGUA(TipoTransacao.DESPESA, "Água"),
    COMUNICACOES(TipoTransacao.DESPESA, "Comunicações"),
    ALIMENTACAO(TipoTransacao.DESPESA, "Alimentação"),
    TRANSPORTE(TipoTransacao.DESPESA, "Transporte"),
    SAUDE(TipoTransacao.DESPESA, "Saúde"),
    EDUCACAO(TipoTransacao.DESPESA, "Educação"),
    LAZER(TipoTransacao.DESPESA, "Lazer"),
    OUTRAS_DESPESAS(TipoTransacao.DESPESA, "Outras despesas");

    private final TipoTransacao tipo;
    private final String rotulo;

    Categoria(TipoTransacao tipo, String rotulo) {
        this.tipo = tipo;
        this.rotulo = rotulo;
    }

    public TipoTransacao getTipo() { return tipo; }

    @Override
    public String toString() { return rotulo; }
}
