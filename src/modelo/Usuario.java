package modelo;

import java.util.Date;

/**
 *
 * @author bcrep
 */
public class Usuario {
    
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private Date datacadastro;
    private Usuariogrupo grupoUsuarios;


    public Date getDatacadastro() {
        return datacadastro;
    }

    public Usuariogrupo getGrupoUsuarios() {
        return grupoUsuarios;
    }

    public void setGrupoUsuarios(Usuariogrupo grupoUsuarios) {
        this.grupoUsuarios = grupoUsuarios;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
     

    public Usuario() {
    }

    public Usuario(Integer id, String nome, String email, String senha, Usuariogrupo grupoUsuarios) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.status = 1;
        this.grupoUsuarios = grupoUsuarios;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
