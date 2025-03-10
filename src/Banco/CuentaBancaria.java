/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Oscar
 */
public class CuentaBancaria {

    private double saldo;

     CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    

    public void depositar(double cantidad) {
        if (cantidad >= 0) {
            saldo += cantidad;
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }

        return false;
    }

    public double getSaldo() {

        return saldo;
    }

}
