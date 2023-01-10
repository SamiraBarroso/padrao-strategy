package org.example;


public class OperacaoSaque implements Operacao{
    @Override
    public double calcular(double saldo, double valorOperacao) {

        if(saldo>=valorOperacao){
            return saldo - valorOperacao;
        }else{
            throw new IllegalArgumentException("Saldo insuficente!");
        }

    }
}