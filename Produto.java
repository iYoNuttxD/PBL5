package PBL5;

public class Produto {
    protected int cod_Produto;
    protected String marca;
    protected String modelo;
    protected String descricao;
    protected float preco;

    public Produto(String marca, String modelo, String descricao, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.descricao = descricao;
        this.preco = preco;
    }
}
