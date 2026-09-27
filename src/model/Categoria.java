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

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoCategoria getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
