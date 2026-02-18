/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temp;

/**
 *
 * @author bisonte
 */
public class EVA1_12_TEMP {

    public int x = 100;
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Temperatura temp = new Temperatura();
        System.out.println("50 °C = " + Temperatura.celAFahr(50) + "°F");
        System.out.println("50 °F = " + Temperatura.fahrACent(50) + "°C");
        EVA1_12_TEMP obj = new EVA1_12_TEMP();
        System.out.println("X = " + obj.x);
        System.out.println("50 °C = " + Temperatura.celAKel(50) + "°K");
        System.out.println("50 °K = " + Temperatura.kelACel(50) + "°C");
        System.out.println("50 °F = " + Temperatura.fahAKel(50) + "°K");
        System.out.println("50 °K = " + Temperatura.kelAFah(50) + "°F");
    }
    
}

class Temperatura{
    public static double celAFahr(double celcius){
        double resultado;
        resultado = celcius * (9.0/5.0) + 32;
        return resultado;
    }
    
    public static double fahrACent(double fahrenheit){
        double resu;
        resu = (5.0/9) * (fahrenheit -32);
        return resu;
    }
    
    public static double celAKel(double celcius){
        double resu;
        resu = celcius + 273.15;
        return resu;
    }
    
    public static double kelACel(double kelvin){
        double resu;
        resu = kelvin - 273.15;
        return resu;
    }
    
    public static double fahAKel(double fahrenheit){
        double resu;
        resu = (5.0/9.0) * (fahrenheit - 32) + 273.15;
        return resu;
    }
    
    public static double kelAFah (double kelvin){
        double resu;
        resu= (9.0/5.0) * (kelvin - 273.15) + 32;
        return resu;
    }
}