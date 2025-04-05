package models;

public class Cliente extends Pessoa {
    private String planoCliente;

    public Cliente(String nome, int idade, String plano) {
        super(nome, idade);
        this.planoCliente = plano;
    }

    public String getPlano() {
        return planoCliente;
    }

    @Override
    public String getDescricao() {
        return "Cliente: " + nomePessoa + ", Idade: " + idadePessoa + ", Plano: " + planoCliente;
    }
}