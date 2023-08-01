/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import controlador.UsuarioDao;
import modelo.Usuario;

/**
 *
 * @author bcrep
 */
public class UsuarioBuscar2 {

    public static void main(String[] args) throws Exception {
      UsuarioDao dao = new UsuarioDao();
        Usuario u = dao.getUsuario(1);     
        System.out.println("Nome: " + u.getNome());
        System.out.println("Email: " + u.getEmail());
    }
    
}
