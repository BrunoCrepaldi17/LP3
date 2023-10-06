package testes;

import controlador.UsuarioDao;
import modelo.Usuario;

public class UsuarioBuscar {

    public static void main(String[] args) throws Exception {
        UsuarioDao dao = new UsuarioDao();
        Usuario u = dao.getUsuario(1);
        
        System.out.println("Nome: " + u.getNome());
        System.out.println("Email: " + u.getEmail());
    }
}
