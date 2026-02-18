/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_10_tv;

/**
 *
 * @author elvat
 */
public class TV {
    private Boolean estado;
    private int volumen;
    private int canal;
    
    public TV(){
        estado = false;
        volumen = 0;
        canal = 0;
    }
    public TV(Boolean estado, int volumen,int canal){
        this.estado = estado;
        this.volumen = volumen;
        this.canal = canal;
    }
    
    public void cambiarEstado(){
        if (estado == false){
            estado = true;
            System.out.println("");
            System.out.println("Encendiste la television");
        }
        else
            estado = false;
    }
    
    public void subirVolumen(){
        if (estado == true)
            volumen ++;
    }
    
    public void bajatVolumen(){
        if (estado == true)
            volumen --;
    }
    
    public void subirCanal(){
        if (estado == true)
            if(canal == 100)
                canal = 0;
            else
                canal ++;
    }
    
    public void bajarCanal(){
        if (estado == true)
            if(canal == 0)
                canal = 100;
            else
                canal --;
    }
    
    public void cambiarCanal(int canal){
        if (estado == true)
            this.canal = canal;
    }
    
    
    public void mostrarTv(){
        if (estado == false){
            System.out.println("");
            System.out.println("La television esta apagada.");}
        else {
            System.out.println("");
            System.out.println("Volumen: " + volumen);
            System.out.println("Canal: " + canal);
        }
    }
}
