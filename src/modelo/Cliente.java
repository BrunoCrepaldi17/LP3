package modelo;

import java.sql.Date;

/**
 *
 * @author bcrep
 */
public class Cliente {
     private Integer id;
    private String nome;
    private Integer tipocliente;
    private String cpfcnpj ;
    private String telefone;
    private String email;
    private String observacao;
    private Date datacadastro;

    public Cliente(Integer id, String nome, Integer tipocliente, 
    String cpfcnpj, String telefone, String email, String observacao, Date datacadastro) {
        this.id = id;
        this.nome = nome;
        this.tipocliente = tipocliente;
        this.cpfcnpj = cpfcnpj;
        this.telefone = telefone;
        this.email = email;
        this.observacao = observacao;
        this.datacadastro = datacadastro;
    }

    public Cliente() {
     }

    public Cliente(Object object, String nome, Integer tipocliente, String cpfcnpj, String telefone, String email, String observacao) {
       }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(Integer tipocliente) {
        this.tipocliente = tipocliente;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

}
