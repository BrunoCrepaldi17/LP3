package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bcrep
 */
public class CompraVenda {

    private Integer id;
    private String operacao;
    private int cliente_id;
    private Double desconto;
    private Integer formaPagamento;
    private List<CompraVendaProduto> produto = new ArrayList<>();

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }


    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Integer formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public List<CompraVendaProduto> getProduto() {
        return produto;
    }

    public void setProduto(List<CompraVendaProduto> produto) {
        this.produto = produto;
    }

}
