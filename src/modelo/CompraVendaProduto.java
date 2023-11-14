/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author bcrep
 */
public class CompraVendaProduto {
    private int id;
    private int CompraVenda_id;
    private int produto_id;
    private Double quantidade;
    private Double valorUnitario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getCompraVenda_id() {
        return CompraVenda_id;
    }

    public void setCompraVenda_id(int CompraVenda_id) {
        this.CompraVenda_id = CompraVenda_id;
    }
    
}
