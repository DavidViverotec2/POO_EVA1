/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_examen;

/**
 *
 * @author elvat
 */
public class EVA1_14_EXAMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestCovid persona1 = new TestCovid(25, false, 60.8, 1.82);
        TestCovid persona2 = new TestCovid(80, false, 50.8, 1.62);
        TestCovid persona3 = new TestCovid(32, true, 62.1, 1.75);
        
        persona1.calcularPersonaRiesgo();
        persona2.calcularPersonaRiesgo();
        persona3.calcularPersonaRiesgo();
    }
    
}
