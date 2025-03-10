/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Oscar
 */
public class CajeroAutomatico {
    
    public double consultarSaldo(Usuario usuario) {
        
        return usuario.getcuenta().getSaldo();
    }
    
    public void depositar(Usuario usuario, double cantidad) {

         usuario.getcuenta().depositar(cantidad);        
    }
    
    public boolean retirar(Usuario usuario, double cantidad) {
        
        return usuario.getcuenta().retirar(cantidad);
    }
    
}
