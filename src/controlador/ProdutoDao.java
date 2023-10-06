package controlador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Produto;

/**
 *
 * @author bcrep
 */
public class ProdutoDao {

    public int inserir(Produto u) throws Exception {
        int retorno;

        String sql = "insert into produto (nome, unidadeDeMedida, datacadastro)"
                + "values (?,?,?)";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            java.util.Date Datacadastro = u.getDatacadastro();
            if (Datacadastro == null) {
                Datacadastro = new java.util.Date();
            }

            Date sqlDate = new Date(Datacadastro.getTime());

            ps.setString(1, u.getNome());
            ps.setString(2, u.getUnidadeDeMedida());
            ps.setDate(3, sqlDate);

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public List<Produto> buscar(String nome) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from produto ";

        if (!nome.equals("")) {
            sql += " where nome like ?";
        }

        sql += " order by nome";

        List<Produto> lista = new ArrayList<>();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            if (!nome.equals("")) {
                ps.setString(1, "%" + nome + "%");
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Produto u = new Produto();
                    u.setId(rs.getInt("id"));
                    u.setNome(rs.getString("nome"));
                    u.setUnidadeDeMedida(rs.getString("unidadeDeMedida"));
                    u.setDatacadastro(rs.getDate("datacadastro"));

                    lista.add(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return lista;
    }

    public Produto getProdutocategoria(int id) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from produto where id = ?";

        Produto obj = null;

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            //Parâmetros da SQL (pode ser mais de 1 param)
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    obj = new Produto();
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
                    obj.setUnidadeDeMedida(rs.getString("unidadeDeMedida"));
                    obj.setDatacadastro(rs.getDate("datacadastro"));
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return obj;
    }

    public int atualizar(Produto u) throws Exception {
        int retorno;

        String sql = "update produto"
                + "      set nome  = ?, "
                + "unidadeDeMedida = ? "
                + "    where id    = ?";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {          
            ps.setString(1, u.getNome());
            ps.setString(2, u.getUnidadeDeMedida());
            ps.setInt(3, u.getId());

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public void excluir(Integer id) throws Exception {
        String sql = "delete from produto where id = ?";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);

            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }
}
