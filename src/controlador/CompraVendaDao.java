/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import modelo.CompraVenda;

/**
 *
 * @author bcrep
 */
public class CompraVendaDao {
    public boolean inserir(CompraVenda obj) throws Exception{
        
        String sql = "insert into compravenda (operacao, cliente_id, formapagamento, desconto)"
                + "values (?, ?, ?, ?)";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, obj.getOperacao());
            ps.setInt(2, obj.getCliente_id());
            ps.setInt(3, obj.getFormaPagamento());
            ps.setDouble(4, obj.getDesconto());

            return ps.executeUpdate() == 1;
        }
        
  
    }

}
