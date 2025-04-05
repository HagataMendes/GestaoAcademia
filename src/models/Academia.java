package models;

import java.util.ArrayList;

class Academia {

     private String nomeAcademia;
     private ArrayList<Pessoa> pessoas;

    public Academia(String nomeAcademia) {
        this.nomeAcademia = nomeAcademia;
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    public void listarPessoas() {
        System.out.println("Lista de Pessoas na Academia:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getDescricao());
        }
    }
}
