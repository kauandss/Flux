package model;

public class Usuario {
    private String nomeDeUsuario;
    private String email;
    private String senha;
    private Conta conta;

    public Usuario(String nomeDeUsuario, String email, String senha) {
        this.nomeDeUsuario = nomeDeUsuario;
        this.email = email;
        this.senha = senha;
        this.conta = new Conta();
    }
}
