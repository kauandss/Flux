package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Receita extends Transacao {

    public Receita(BigDecimal valor, LocalDate data, Categoria categoria, String descricao) {
        super(valor, data, categoria, descricao);
    }

    @Override
    public BigDecimal valorComSinal() {
        return this.valor.abs();
    }
}
