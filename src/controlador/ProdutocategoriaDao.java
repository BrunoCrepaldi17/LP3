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
import modelo.Produtocategoria;

/**
 *
 * @author bcrep
 */
public class ProdutocategoriaDao {
  public int inserir(Produtocategoria u) throws Exception {
        int retorno;

        String sql = "insert into produtocategoria (nome)"
                + "values (?)";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getNome());

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public List<Produtocategoria> buscar(String nome) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from produtocategoria ";

        if (!nome.equals("")) {
            sql += " where nome like ?";
        }

        sql += " order by nome";

        List<Produtocategoria> lista = new ArrayList<>();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            if (!nome.equals("")) {
                ps.setString(1, "%" + nome + "%");
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Produtocategoria u = new Produtocategoria();
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

    public Produtocategoria getProdutocategoria(int id) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from produtocategoria where id = ?";

        Produtocategoria obj = null;

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            //Parâmetros da SQL (pode ser mais de 1 param)
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    obj = new Produtocategoria();
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return obj;
    }

    public int atualizar(Produtocategoria u) throws Exception {
        int retorno;

        String sql = "update produtocategoria"
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
        String sql = "delete from produtocategoria where id = ?";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);

            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }   
}
