/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_tv;

/**
 *
 * @author elvat
 */
public class EVA1_10_TV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TV television = new TV();
        television.mostrarTv();
        
        television.cambiarEstado();
        
        television.subirVolumen();
        television.subirVolumen();
        television.subirVolumen();
        television.subirVolumen();
        television.subirVolumen();
        television.bajatVolumen();
        
        television.cambiarCanal(12);
        television.bajarCanal();
        television.bajarCanal();
        television.bajarCanal();
        television.subirCanal();
        
        television.mostrarTv();
        
        television.bajarCanal();
        television.mostrarTv();
        
        television.cambiarEstado();
        television.bajatVolumen();
        television.mostrarTv();
        
        television.cambiarEstado();
        television.cambiarCanal(0);
        television.mostrarTv();
        television.bajarCanal();
        television.mostrarTv();
        
        television.mostrarTv();
        television.subirCanal();
        television.mostrarTv();
    }
    
}
