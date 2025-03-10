/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Oscar
 */
public class Usuario {

    private String nombre;
    private CuentaBancaria cuenta;

    public Usuario(String nombre, double SaldoInicial) {
        this.nombre = nombre;
        this.cuenta = new CuentaBancaria(SaldoInicial);
    }
    public void mostrarUsuario (String nom, double saldo){
        System.out.println("El usuario es: "+ nom+ ", con un saldo de: "+ saldo);
    }

    public String getNombre() {
        return nombre;
    }

    public CuentaBancaria getcuenta() {
        return cuenta;
    }
}
