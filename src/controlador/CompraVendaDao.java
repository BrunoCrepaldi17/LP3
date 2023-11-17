/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import modelo.CompraVenda;
import modelo.CompraVendaProduto;

/**
 *
 * @author bcrep
 */
public class CompraVendaDao {
    
    public int inserirProduto(Integer vendaId, CompraVendaProduto obj) throws Exception {
        int retorno;
        
        String sql = "insert into compravendaproduto (compravenda_id, produto_id, quantidade, valorunitario)"
                + "values (?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            
            ps.setInt(1, vendaId);
            ps.setInt(2, obj.getProduto_id());
            ps.setDouble(3, obj.getQuantidade());
            ps.setDouble(4, obj.getValorUnitario());
            
            retorno = ps.executeUpdate();
        }
        
        return retorno;
    }
    
    public int inserir(CompraVenda obj, List<CompraVendaProduto> produtos) throws Exception {
        int retorno;
        
        String sql = "insert into compravenda (operacao, cliente_id, formapagamento, desconto)"
                + "values (?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS)) {
            
            ps.setString(1, obj.getOperacao());
            ps.setInt(2, obj.getCliente_id());
            ps.setInt(3, obj.getFormaPagamento());
            ps.setDouble(4, obj.getDesconto());
            
            retorno = ps.executeUpdate();
            
            java.sql.ResultSet ts = ps.getGeneratedKeys();
            
            if (ts.next()) {
                for (int i = 0; i < produtos.size(); i++) {
                    System.out.println(produtos.get(i).toString());
                    Integer vendaId = ts.getInt(1);
                    this.inserirProduto(vendaId, produtos.get(i));`
                }
            }
            
        }
        return retorno;
    }
}
