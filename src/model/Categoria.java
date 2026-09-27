package model;

public class Categoria {
    private String nome;
    private String descricao;
    private TipoCategoria tipo;

    public Categoria(String nome, String descricao, TipoCategoria tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
    }
}
