package modelo;

/**
 *
 * @author bcrep
 */
public class Produtocategoria {

    private Integer id;
    private String nome;

    public Produtocategoria() {
    }

    public Produtocategoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
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

}
