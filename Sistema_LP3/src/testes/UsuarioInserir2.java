package testes;

import controlador.UsuarioDao;
import modelo.Usuario;

public class UsuarioInserir2 {

    public static void main(String[] args) {
        try {
            Usuario u = new Usuario(
                    null, "Bruno Crepaldi",
                    "brunocrepaldi.2009@gmail.com", "1234");
            UsuarioDao dao = new UsuarioDao();
            dao.inserir(u);

            System.out.println("Usuario inserido com sucesso.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
