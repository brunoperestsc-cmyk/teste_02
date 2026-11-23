package controlegastos.servico;

import java.util.Locale;

public class Formatador {
    private Formatador() { }

    public static String formatar(double valor) {
        return String.format(Locale.of("pt", "BR"), "%,.2f", valor);
    }
}
