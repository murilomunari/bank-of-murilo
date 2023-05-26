package br.com.conta.model;

public class Banco {

    private String nome;

    private Agencia agencias;

    public Banco() {
    }

    public Banco(String nome, Agencia agencias) {
        this.nome = nome;
        this.agencias = agencias;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Agencia getAgencias() {
        return agencias;
    }

    public void setAgencias(Agencia agencias) {
        this.agencias = agencias;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", agencias=" + agencias +
                '}';
    }
}
