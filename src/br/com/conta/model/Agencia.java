package br.com.conta.model;

public class Agencia {

    private String numero;

    private double saldo;

    private Conta contas;

    private Banco banco;

    public Agencia() {
    }

    public Agencia(String numero, double saldo, Conta contas, Banco banco) {
        this.numero = numero;
        this.saldo = saldo;
        this.contas = contas;
        this.banco = banco;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta getContas() {
        return contas;
    }

    public void setContas(Conta contas) {
        this.contas = contas;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", contas=" + contas +
                ", banco=" + banco +
                '}';
    }
}
