package app;

import model.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Usuario usuario = new Usuario("kauan","kauandss@gmail.com", "12345");

        Conta minhaConta = usuario.getConta();

        Categoria categoria1 = new Categoria("Transporte","Metrô - Transporte Público",
                TipoCategoria.DESPESA);

        Despesa despesa1 = new Despesa(BigDecimal.valueOf(20.00), LocalDate.of(2026, 9, 27),
                categoria1, "Coloquei R$20,00 no bilhete único", "Débito");

        minhaConta.adicionarTransacao(despesa1);

        System.out.println(minhaConta.calcularSaldoAtual());
        System.out.println(minhaConta.obterTodasTransacoes());
        System.out.println(minhaConta.filtrarPorCategoria("Transporte"));
    }
}
