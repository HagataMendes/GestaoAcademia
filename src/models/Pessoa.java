package models;
//HerançaPOO

abstract class Pessoa {
    protected String nomePessoa;
    protected int idadePessoa;

    public Pessoa(String nome, int idade) {
        this.nomePessoa = nome;
        this.idadePessoa = idade;
    }

    public String getNome() {
        return nomePessoa;
    }

    public int getIdade() {
        return idadePessoa;
    }

    public abstract String getDescricao();
}
