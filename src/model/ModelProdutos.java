package model;

public class ModelProdutos {
    private int id;
    private String produto;
    private int preco;
    private String descricao;
    
    public ModelProdutos() {
    }

    public ModelProdutos(int id, String produto, int preco, String descricao ) {
        this.id = id;
        this.produto = produto;
        this.preco = preco;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
