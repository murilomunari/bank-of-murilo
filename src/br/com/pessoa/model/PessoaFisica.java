package br.com.pessoa.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaFisica extends Pessoa{

    private String CPF;

    private Collection<PessoaFisica> filhos = new Vector<>();

    public PessoaFisica() {
    }

    public PessoaFisica addFilhos(PessoaFisica filho) {
        this.getFilhos().add(filho);
        return this;
    }

    public PessoaFisica removeFilhos(PessoaFisica filho){
        this.getFilhos().remove(filho);
        return this;
    }
    public Collection<PessoaFisica> getFilhos(){
        return Collections.unmodifiableCollection(this.filhos);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + CPF + '\'' +
                ", filhos=" + filhos +
                "} " + super.toString();
    }
}
