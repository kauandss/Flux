package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Receita extends Transacao{

    public Receita(BigDecimal valor, LocalDate data, String categoria, String descricao, String formaDePagamento){
        super(valor, data, categoria, descricao, formaDePagamento);
    }

    @Override
    public BigDecimal valorComSinal() {
        return this.valor.abs();
    }
}
