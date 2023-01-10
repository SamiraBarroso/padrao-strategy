package org.example;

public class OperacaoTransferencia implements Operacao{

    private String numContaDestino;

    public OperacaoTransferencia(String numContaDestino) {
        this.numContaDestino = numContaDestino;
    }

    @Override
    public double calcular(double saldo, double valorOperacao) {
        if(saldo>=valorOperacao){
            return saldo - valorOperacao;
        }else{
            throw new IllegalArgumentException("Saldo insuficente!");
        }
    }
}