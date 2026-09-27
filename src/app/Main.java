package app;

import model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Usuario usuario = new Usuario("kauan", "kauandss@gmail.com", "12345");
        Conta minhaConta = usuario.getConta();
        int opcao;

        Categoria catAlimentacao = new Categoria("Alimentação","delivery",TipoCategoria.DESPESA);
        Categoria catTransporte = new Categoria("Transporte","transporte público",TipoCategoria.DESPESA);
        Categoria catLazer = new Categoria("Lazer","entretenimento",TipoCategoria.DESPESA);
        Categoria catOutros = new Categoria("Outros","...",TipoCategoria.DESPESA);

        Categoria catSalario = new Categoria("Salário","remuneração recebida pelo trabalho",
                TipoCategoria.RECEITA);
        Categoria catRendaExtra = new Categoria("Renda Extra","valores obtidos com atv. complementares",
                TipoCategoria.RECEITA);

        do{
            System.out.println("Ex: 1- Nova Despesa | 2- Ver Saldo | 3- Nova Receita | 0- Sair");
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Categoria: 1- Alimentação | 2- Transporte | 3- Lazer");
                    int opcaoCategoriaDespesa = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Valor da despesa: ");
                    BigDecimal valorDespesa = entrada.nextBigDecimal();
                    entrada.nextLine();
                    System.out.println("Descrição: ");
                    String descricaoDespesa = entrada.nextLine();
                    System.out.println("Forma de pagamento: ");
                    String formaDePagamentoDespesa = entrada.nextLine();
                    System.out.println("Criando Despesa...");

                    Categoria categoriaDespesa = switch (opcaoCategoriaDespesa) {
                        case 1 -> catAlimentacao;
                        case 2 -> catTransporte;
                        case 3 -> catLazer;
                        default -> catOutros;
                    };

                    Despesa despesa = new Despesa(valorDespesa, LocalDate.now(),categoriaDespesa,
                            descricaoDespesa,formaDePagamentoDespesa);

                    minhaConta.adicionarTransacao(despesa);
                    break;
                case 2:
                    System.out.println("Atualizando saldo...");
                    System.out.println(minhaConta.calcularSaldoAtual());
                    System.out.println(minhaConta.obterTodasTransacoes());
                    break;
                case 3:
                    System.out.println("Categoria: 1- Salário | 2- Renda Extra");
                    int opcaoCategoriaReceitas = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Valor da receita: ");
                    BigDecimal valorReceita = entrada.nextBigDecimal();
                    entrada.nextLine();
                    System.out.println("Descrição: ");
                    String descricaoReceita = entrada.nextLine();
                    System.out.println("Forma de recebimento: ");
                    String formaDeRecebimentoReceita = entrada.nextLine();
                    System.out.println("Criando Receita...");

                    Categoria categoriaReceita = switch (opcaoCategoriaReceitas) {
                        case 1 -> catSalario;
                        case 2 -> catRendaExtra;
                        default -> catOutros;
                    };

                    Receita receita = new Receita(valorReceita, LocalDate.now(),categoriaReceita,
                            descricaoReceita,formaDeRecebimentoReceita);

                    minhaConta.adicionarTransacao(receita);
                case 0:
                    System.out.println("Encerrando o Gerenciador!");
                    break;
            }
        } while(opcao != 0);
    }
}
