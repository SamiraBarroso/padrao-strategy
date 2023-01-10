package org.example;

public class ContaBancaria {
    private String numeroConta;
    private String nome;
    private double saldo;

    public ContaBancaria(String numeroConta, String nome,  double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valorDeposito){
        Calculadora calculadora = new Calculadora(this.saldo, valorDeposito);
        this.saldo = calculadora.calcular(new OperacaoDeposito());
    }
    public void sacar(double valorSaque){
        Calculadora calculadora = new Calculadora(this.saldo, valorSaque);
        this.saldo = calculadora.calcular(new OperacaoSaque());
    }
    public void transferirReal(String numeroConta,double valorTransferenciaReal){
        Calculadora calculadora = new Calculadora(this.saldo, valorTransferenciaReal);
        this.saldo = calculadora.calcular(new OperacaoTransferencia(numeroConta));
    }

}