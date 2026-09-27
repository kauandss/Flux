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

        Categoria categoria2 = new Categoria("Alimentação","McDonald's",TipoCategoria.DESPESA);

        Categoria categoria3 = new Categoria("Lazer","Steam",
                TipoCategoria.DESPESA);



        Despesa despesa1 = new Despesa(BigDecimal.valueOf(20.00), LocalDate.of(2026, 9, 27),
                categoria1, "Coloquei R$20,00 no bilhete único", "Débito");

        Despesa despesa2 = new Despesa(BigDecimal.valueOf(45.00),LocalDate.of(2026,8,17),
                categoria2,"Comprei um McDonald's no shopping","Débito");

        Despesa despesa3 = new Despesa(BigDecimal.valueOf(12.00),LocalDate.of(2026,7,24),
                categoria3,"Comprei o Stardew Valley","Pix");

        minhaConta.adicionarTransacao(despesa1);
        minhaConta.adicionarTransacao(despesa2);
        minhaConta.adicionarTransacao(despesa3);

        System.out.println(minhaConta.calcularSaldoAtual());
        System.out.println(minhaConta.obterTodasTransacoes());
        System.out.println(minhaConta.filtrarPorCategoria("Lazer"));
    }
}
