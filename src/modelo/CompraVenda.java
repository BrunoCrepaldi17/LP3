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
    private int formaPagamento;
    private List<CompraVendaProduto> produtos = new ArrayList<>();

    public void addProduto (CompraVendaProduto produto){
        this.produtos.add(produto);
    }
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
        return produtos;
    }

    public void setProduto(List<CompraVendaProduto> produtos) {
        this.produtos = produtos;
    }

    public void setFormaPagamento(String formaPagamento) {
        if (formaPagamento.equalsIgnoreCase("dinheiro")) {
            this.formaPagamento = 1;
            return;
        }
        if (formaPagamento.equalsIgnoreCase("Cartão de crédito")) {
            this.formaPagamento = 2;
            return;
        }
        if (formaPagamento.equalsIgnoreCase("Cartão de Débito")) {
            this.formaPagamento = 3;
            return;
        }
        if (formaPagamento.equalsIgnoreCase("PIX")) {
            this.formaPagamento = 4;
            return;
        }
        if (formaPagamento.equalsIgnoreCase("Boleto")) {
            this.formaPagamento = 5;
            return;
        }

        this.formaPagamento = 1;
    }
    public String getFormapagamentoDescricao() {
        switch (this.formaPagamento) {
            case 1:
                return "Dinheiro";
            case 2:
                return"Cartão de Crédito";
            case 3 :
                return "Cartão de Débito";
            case 4 :
                return "PIX";
            case 5 :
                return "Boleto";
            default  :
                return "Não especificado";
        }
    }
}
