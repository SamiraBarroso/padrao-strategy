package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContaBancariaTest {
    ContaBancaria contaBancaria;

    @BeforeEach
    void setUp() {
        contaBancaria = new ContaBancaria("0112500", "Lupercio", 100.d);
    }

    @Test
    void deveRetornarSaldoAposDeposito(){
        contaBancaria.depositar(50.0d);
        assertEquals(150.0d, contaBancaria.getSaldo());
    }

    @Test
    void deveRetornarSaldoAposSaque(){
        contaBancaria.sacar(75.0d);
        assertEquals(25.0d, contaBancaria.getSaldo());
    }

    @Test
    void deveRetornarSaldoInsuficienteParaSaque(){
        try{
            contaBancaria.sacar(150.0d);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Saldo insuficente!", e.getMessage());
        }

    }

    @Test
    void deveRetornarSaldoAposTransferenciaReal(){
        contaBancaria.transferirReal("90834",90.0d);
        assertEquals(10.0d, contaBancaria.getSaldo());
    }

    @Test
    void deveRetornarSaldoInsuficienteParaTransferencia(){
        try{
            contaBancaria.transferirReal("90834",150.0d);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Saldo insuficente!", e.getMessage());
        }

    }


}