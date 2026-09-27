package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Transacao {
    protected BigDecimal valor;
    protected String descricao;
    protected Categoria categoria;
    protected String formaDePagamento;
    protected LocalDate data;

    public Transacao(BigDecimal valor, LocalDate data, Categoria categoria, String descricao, String formaDePagamento) {
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
        this.descricao = descricao;
        this.formaDePagamento = formaDePagamento;
    }

    public Transacao(BigDecimal valor, LocalDate data, Categoria categoria, String descricao) {
        this(valor, data, categoria, descricao, null);
    }

    public abstract BigDecimal valorComSinal();

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public LocalDate getData() {
        return data;
    }
}
