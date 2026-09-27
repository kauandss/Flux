package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Conta {
    private List<Transacao> transacoes = new ArrayList<>();

    public Conta() {

    }

    public void adicionarTransacao(Transacao transacao) {
        this.transacoes.add(transacao);
    }

    public List<Transacao> obterTodasTransacoes() {
        return this.transacoes;
    }

    public BigDecimal calcularSaldoAtual() {
        BigDecimal saldoTotal = BigDecimal.ZERO;

        for (Transacao transacaoAtual : transacoes) {
            saldoTotal = saldoTotal.add(transacaoAtual.valorComSinal());
        }

        return saldoTotal;
    }

    public List<Transacao> filtrarPorCategoria(String nomeDaCategoria) {
        List<Transacao> transacoesFiltradas = new ArrayList<>();

        for (Transacao transacaoAtual : transacoes) {
            if(transacaoAtual.getCategoria().equalsIgnoreCase(nomeDaCategoria)){
                transacoesFiltradas.add(transacaoAtual);
            }
        }

        return transacoesFiltradas;
    }


}
