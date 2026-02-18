/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_static;

/**
 *
 * @author bisonte
 */
public class EVA1_11_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pi = " + Math.PI);
        System.out.println("Valor Aleatorio = " + Math.random());
        System.out.println("Potencia 5^2 = " + Math.pow(5,2));
        
        // Clase Matematicas
        System.out.println("Clase Matematicas **********");
        //Matematicas mate = new Matematicas();
        System.out.println("PI = " + Matematicas.PI);
        
       
    }
    
    
        
    
    
    class Matematicas{
        public static final double PI = 3.141592;
        }
    }

