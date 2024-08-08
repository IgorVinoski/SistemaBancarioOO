package conta;

import pessoa.Pessoa;

public class Conta {
    private Pessoa titular;
    private int numero;
    private double saldo;
    public Conta(int numero, Pessoa titular){
        this.numero=numero;
        this.titular=titular;
    }

    public Conta(int numero, Pessoa titular, double saldoInicial){
        this.numero=numero;
        this.depositar(saldoInicial);
    }
    public boolean sacar(double valorASacar){
        if(this.saldo >= valorASacar){
            this.saldo -= valorASacar;
            return true;
        }
        return false;
    }

    public void depositar(double saldoADepositar){
        this.saldo +=saldoADepositar;
        System.out.println("SALDO: " + this.saldo);

    }

    public void transferir(Conta contaDestino, double valorATransferir) {
        sacar(valorATransferir);
        contaDestino.depositar(valorATransferir);

    }
    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
}