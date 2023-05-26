package br.com.conta.model;

import br.com.pessoa.model.Pessoa;

public class Conta {

    private String numero;

    private double saldo;

    private Pessoa titular;

    private Agencia agencia;


    public Conta() {
    }

    public Conta(String numero, double saldo, Pessoa titular, Agencia agencia) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.agencia = agencia;
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

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", titular=" + titular +
                ", agencia=" + agencia +
                '}';
    }
}
