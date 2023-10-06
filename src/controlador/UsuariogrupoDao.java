/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuariogrupo;

/**
 *
 * @author bcrep
 */
public class UsuariogrupoDao {

    public int inserir(Usuariogrupo u) throws Exception {
        int retorno;

        String sql = "insert into usuariogrupo (nome)"
                + "values (?)";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getNome());

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public List<Usuariogrupo> buscar(String nome) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from usuariogrupo ";

        if (!nome.equals("")) {
            sql += " where nome like ?";
        }

        sql += " order by nome";

        List<Usuariogrupo> lista = new ArrayList<>();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            if (!nome.equals("")) {
                ps.setString(1, "%" + nome + "%");
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Usuariogrupo u = new Usuariogrupo();
                    u.setId(rs.getInt("id"));
                    u.setNome(rs.getString("nome"));
                    
                    lista.add(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return lista;
    }

    public Usuariogrupo getUsuariogrupo(int id) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from usuariogrupo where id = ?";

        Usuariogrupo obj = null;

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            //Parâmetros da SQL (pode ser mais de 1 param)
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    obj = new Usuariogrupo();
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return obj;
    }

    public int atualizar(Usuariogrupo u) throws Exception {
        int retorno;

        String sql = "update usuariogrupo"
                + "      set nome  = ?"
                + "    where id    = ?";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getNome());
            ps.setInt(2, u.getId());

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public void excluir(Integer id) throws Exception {
        String sql = "delete from usuariogrupo where id = ?";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);

            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }
      public ArrayList<Usuariogrupo> buscarTodos() throws Exception {
        String query = "select * from usuariogrupo order by nome";

        Connection con = Conexao.getConexao();
        
        ArrayList<Usuariogrupo> usuariogrupo = new ArrayList<>();

        try ( PreparedStatement ps = con.prepareStatement(query); ResultSet resultSet = ps.executeQuery()) {

            while (resultSet.next()) {
                Usuariogrupo groupFromUser = new Usuariogrupo();
                groupFromUser.setId(resultSet.getInt("id"));
                groupFromUser.setNome(resultSet.getString("nome"));
                usuariogrupo.add(groupFromUser);
            }
            return usuariogrupo;
        }

    }

}
