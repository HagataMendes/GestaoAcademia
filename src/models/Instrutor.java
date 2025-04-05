package models;

public class Instrutor extends Pessoa {
    private String especialidadeInstrutor;

    public Instrutor(String nome, int idade, String especialidadeInstrutor) {
        super(nome, idade);
        this.especialidadeInstrutor = especialidadeInstrutor;

    }

    public String getEspecialidadeInstrutor() {
        return especialidadeInstrutor;
    }

    @Override
    public String toString() {
        return "Instrutor{" + "especialidadeInstrutor='" + especialidadeInstrutor + '\'' + ", nomePessoa='" + nomePessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                '}';
    }
}

