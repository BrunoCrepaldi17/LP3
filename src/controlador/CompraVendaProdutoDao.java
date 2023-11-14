/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.CompraVendaProduto;

/**
 *
 * @author bcrep
 */
public class CompraVendaProdutoDao {

    public boolean inserir(CompraVendaProduto obj) throws Exception {

        String sql = "insert into compravendaproduto (compravenda_id, produto_id, "
                + "quantidade, valorunitario)"
                + "values (?, ?, ?, ?)";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql,
                java.sql.Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, obj.getCompraVenda_id());
            ps.setInt(2, obj.getProduto_id());
            ps.setDouble(3, obj.getQuantidade());
            ps.setDouble(4, obj.getValorUnitario());

            return ps.executeUpdate() ==1;
        }

    }
}
