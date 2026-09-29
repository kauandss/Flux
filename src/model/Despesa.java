package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesa extends Transacao {

    public Despesa(BigDecimal valor, LocalDate data, Categoria categoria, String descricao) {
        super(valor, data, categoria, descricao);
    }

    @Override
    public BigDecimal valorComSinal() {
        return this.valor.negate();
    }

    @Override
    public String toString() {
        return String.format("[-] Despesa: %s | Valor: R$ %.2f | Categoria: %s | Data: %s",
                descricao, valor, categoria, data);
    }
}
