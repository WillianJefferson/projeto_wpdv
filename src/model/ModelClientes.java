package model;

public class ModelClientes {

    private int id;
    private String nome;
    private String endereco;
    private String email;
    private String cidade;
    private String uf;
    private String cep;
    private String telefone;


    public ModelClientes(){}
    
    
    
    public ModelClientes(int id, String nome, String endereco, String email, String cidade, String uf, String cep, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getCidade(){
        return this.cidade;
    }

    public void setUf(String uf){
        this.uf = uf;
    }

    public String getUf(){
        return this.uf;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getCep(){
        return this.cep;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return this.telefone;
    }


    
}