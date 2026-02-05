package eva1_4_encapsulamiento;
public class Persona {
    // Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    
    // Constructores
    // Comportamiento : // interfaz = metodos
    // get y set
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String valor){
        apellidos = valor;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int valor){
        edad = valor;
    }
    
    public char getGenero(){
        return genero;
    }
    
    public void setGenero(char valor){
        genero = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre); 
        System.out.println("Apellidos: " + apellidos); 
        System.out.println("Edad: " + edad); 
        System.out.println("Genero: " + genero); 
    }
}
