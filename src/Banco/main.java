/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.*;

/**
 *
 * @author Oscar
 */
/*public class main {

   // public static void main(String[] args) {
        int op;
        double saldo = 0;
        String nom = null;
        Scanner s = new Scanner(System.in);
        CuentaBancaria banco = new CuentaBancaria(saldo);
        Usuario usa = new Usuario(nom, saldo);
        CajeroAutomatico cajero = new CajeroAutomatico();
        do {
            System.out.println("-----BANCO MENU-----"
                    + "\n 1.-Crear Usuario"
                    + "\n 2.-Mostrar Usuario"
                    + "\n 3.-Mostrar saldo"
                    + "\n 4.-Ingresar saldo"
                    + "\n 5.-Retirar saldo"
                    + "\n 0.-Salir");
            op = s.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del usuario");
                    nom = s.next();
                    System.out.println("Ingrese el salod a la cuenta");
                    saldo = s.nextDouble();                    
                    usa.mostrarUsuario(nom, saldo);
                    banco.depositar(saldo);
                    break;
                case 2 : 
                    System.out.println(cajero.consultarSaldo(usa));
                    break;
                case 3 : 
                    System.out.println("El saldo es de: "+ banco.getSaldo()); 
                    break ; 
                case 4 :
                    System.out.println("Su saldo es de: "+ banco.getSaldo());
                    System.out.println("cuanto va a depositar: ");
                    saldo= s.nextDouble();
                    banco.depositar(saldo);
                    System.out.println("Ahora su saldo es de: "+ banco.getSaldo());
                    break;
                case 5 : 
                    System.out.println("Su saldo es de: "+ banco.getSaldo());
                    System.out.println("Cuanto va a retirar: ");
                    saldo= s.nextDouble();
                    banco.retirar(saldo);
                    System.out.println("Ahora su saldo es de: "+ banco.getSaldo());
                    break; 
            }

        } while (op
                != 0);

    }

}*/
