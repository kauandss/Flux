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

    public BigDecimal calcularSomaLista(List<Transacao> transacoes) {
        BigDecimal total = BigDecimal.ZERO;
        for(Transacao t : transacoes){
            total = total.add(t.valorComSinal());
        }
        return total;
    }

    public BigDecimal calcularSaldoAtual() {
        return calcularSomaLista(this.transacoes);
    }

    public List<Transacao> filtrarPorCategoria(String nomeDaCategoria) {
        List<Transacao> transacoesFiltradas = new ArrayList<>();

        for (Transacao transacaoAtual : transacoes) {
            if (transacaoAtual.getCategoria().getNome().equalsIgnoreCase(nomeDaCategoria)) {
                transacoesFiltradas.add(transacaoAtual);
            }
        }

        return transacoesFiltradas;
    }


}
