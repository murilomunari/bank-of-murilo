package br.com.pessoa.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaJudrica  extends Pessoa{

    private String CNPJ;

    private String razaoSocial;

    private Collection<PessoaJudrica> socios = new Vector<>();

    public PessoaJudrica() {
    }

    public PessoaJudrica addSocios(PessoaJudrica socios) {
        this.getSocios().add(socios);
        return this;
    }

    public PessoaJudrica removeSociois(PessoaJudrica socios){
        this.getSocios().remove(socios);
        return this;
    }

    public Collection<PessoaJudrica> getSocios(){
        return Collections.unmodifiableCollection(this.socios);
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCPNJ(String CPNJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + CNPJ + '\'' +
                ", filhos=" + socios +
                "} " + super.toString();
    }
}
