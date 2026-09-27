package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesa extends Transacao {
    private String formaDePagamento;

    public Despesa(BigDecimal valor, LocalDate data, Categoria categoria, String descricao, String formaDePagamento) {
        super(valor, data, categoria, descricao);
        this.formaDePagamento = formaDePagamento;
    }

    @Override
    public BigDecimal valorComSinal() {
        return this.valor.negate();
    }

    @Override
    public String toString() {
        return "Despesa{" +
                "valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", categoria=" + categoria +
                ", formaDePagamento='" + formaDePagamento + '\'' +
                ", data=" + data +
                '}';
    }
}
