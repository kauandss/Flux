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
        return String.format("[-] Despesa: %s | Valor: R$ %.2f | Categoria: %s | Pagamento: %s | Data: %s",
                descricao, valor, categoria, formaDePagamento, data);
    }
}
