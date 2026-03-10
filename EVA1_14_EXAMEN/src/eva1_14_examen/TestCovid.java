/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_14_examen;

/**
 *
 * @author bisonte
 */
public class TestCovid {
    // ATRIBUTOS
    
    private int edad;
    private boolean enfermedad;
    private double peso;
    private double estatura;
    
    // CONSTRUCTOR DEFAULT
    public TestCovid(){
            edad = 0;
            enfermedad = false;
            peso = 0.0 ;
            estatura = 0.0;
    }
    
    
    // CONSTRUCTOR CON ARGUMENTOS
    public TestCovid(int edad, boolean enfermedad, double peso, double estatura){
        this.edad = edad;
        this.enfermedad = enfermedad;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    // METODOS GET Y SET
    
    public double getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public boolean getEnfermedad(){
        return enfermedad;
    }
    
    public void setEnfermedad(boolean enfermedad){
        this.enfermedad = enfermedad;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getEstatura(){
        return estatura;
    }
    
    public void setEstatura(Double estatura){
        this.estatura = estatura;
    }


   public String calcularPersonaRiesgo(){
       String resu = "Persona de riesgo";
       if ( (edad >= 65) || (enfermedad != false) ||(calcularIMC() > 30) )
           return resu;
        return null;
   } 
   
    private  double calcularIMC(){
        return peso/(estatura*estatura);
   }
}


