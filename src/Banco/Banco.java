/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Oscar
 */
public class Banco {
    public static void main (String [] args){
        Usuario usa = new Usuario("Oscar Alfredo", 1000);
        CajeroAutomatico cajero = new CajeroAutomatico ();
        System.out.println("Saldo inicial: "+ cajero.consultarSaldo(usa));
        cajero.depositar(usa, 500);
        System.out.println("El saldo ahora es: "+cajero.consultarSaldo(usa));
        boolean retiro = cajero.retirar(usa, 300);
        if (retiro){
            System.out.println("retiro exitoso de 300");
        }else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("saldo final: "+ cajero.consultarSaldo(usa));
    }
}
