
package visao;

import modelo.Usuario;

public class DadosDeSessao {
    private static Usuario usuario = null;
    public static String nomeSistema = "Crepaldi Sistemas " ;

    
    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        DadosDeSessao.usuario = usuario;
    }
    
}
