package modelo;

import java.sql.Date;

/**
 *
 * @author bcrep
 */
public class Produto {

   private Integer id;
    private String nome;
    private String unidadeDeMedida;
    private Date datacadastro;

    public Produto(Integer id, String nome, String unidadeDeMedida) {
        this.id = id;
        this.nome = nome;
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public Produto() {
        
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

    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }
    

}

