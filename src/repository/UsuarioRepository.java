package repository;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private List<Usuario> usuariosCadastrados;

    public UsuarioRepository() {
        this.usuariosCadastrados = new ArrayList<>();
    }

    public void salvarUsuario(Usuario usuario){
        usuariosCadastrados.add(usuario);
    }
}
