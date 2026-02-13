/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_cuenta_bancaria;

/**
 *
 * @author elvat
 */
public class EVA1_9_CUENTA_BANCARIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("David Vivero", 10005);
        
        cuenta1.imprimirSaldo();
        cuenta1.retirar(500);
        cuenta1.imprimirSaldo();
        cuenta1.ingresar(5023);
        cuenta1.imprimirSaldo();
        cuenta1.ingresar(-100000);
        cuenta1.imprimirSaldo();
        cuenta1.retirar(5000000);
        cuenta1.imprimirSaldo();
        
    }
    
}
