package br.com.conta.model;

import br.com.pessoa.model.Pessoa;

public class Conta {

    private String numero;

    private double saldo;

    private Pessoa dono;

    public Conta() {
    }

    public Conta(String numero, double saldo, Pessoa dono) {
        this.numero = numero;
        this.saldo = saldo;
        this.dono = dono;
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

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", dono=" + dono +
                '}';
    }
}
