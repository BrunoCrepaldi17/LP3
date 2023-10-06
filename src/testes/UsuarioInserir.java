package testes;

import controlador.UsuarioDao;
import modelo.Usuario;

public class UsuarioInserir {

    //DAO - Data Access Object
    public static void main(String[] args) {

        try {
            Usuario u = new Usuario(
                    null, "Marcelo Borth",
                    "marcelo.borth@ifpr.edu.br", "1234", null);
            
            UsuarioDao dao = new UsuarioDao();
            dao.inserir(u);
            
            System.out.println("Usuário inserido com sucesso.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
