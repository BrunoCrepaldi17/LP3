package controlador;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author bcrep
 */
public class UsuarioDao {
    // DAO - Data Access Object
    
    public int inserir (Usuario u) throws Exception {
        int  retorno;
        
        String sql = "insert into usuario (nome, email, senha)"
                + "values(?, ?, ?)";
        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, u.getNome());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getSenha());
            
            retorno = ps.executeUpdate();
        } 
        return retorno;
    }
    
    public List<Usuario> buscar(String nome) throws Exception{
     Connection conexao = Conexao.getConexao();
       String sql = "select * from usuario";
       
        if (!nome.equals("")) {
            sql += " where nome like ?";
        }
       sql += " order by nome";
       
       List<Usuario> lista = new ArrayList<>();
       
       
        try (PreparedStatement ps = conexao.prepareStatement(sql)){
            if (!nome.equals("")) {
                ps.setString(1,"%" + nome + "%");
            }
            
            try (ResultSet rs = ps.executeQuery()){
                while(rs.next()){
                    Usuario u = new Usuario();
                    u.setId(rs.getInt("id"));
                    u.setNome(rs.getString("nome"));
                    u.setEmail(rs.getString("email"));
                    
                    lista.add(u);
                }
            }
        } catch (Exception e) {
        }
       
       return lista;
    }
    
    
    public Usuario getUsuario(int id) throws Exception{
       Connection conexao = Conexao.getConexao();
       String sql = "select * from usuario were id = ?";
       
       Usuario obj = null;
       
        try (PreparedStatement ps = conexao.prepareStatement(sql)){
            try ( ResultSet rs = ps.executeQuery()){
                ps.setInt(1, id);
                
                if (rs.next()) {
                    obj = new Usuario();
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
                    obj.setNome(rs.getString("email"));
                }
            }          
        } catch (Exception e) {
        }
        
       return obj;
    }
}
