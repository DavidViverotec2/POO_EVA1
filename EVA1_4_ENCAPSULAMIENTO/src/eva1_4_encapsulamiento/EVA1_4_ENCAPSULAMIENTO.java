package eva1_4_encapsulamiento;
public class EVA1_4_ENCAPSULAMIENTO {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setApellidos("Sanchez");
        persona.setNombre("Juancho");
        persona.setEdad(52);
        persona.setGenero('H');
        
        /* System.out.println("Nombre: " + persona.getNombre()); 
        System.out.println("Apellidos: " + persona.getApellidos()); 
        System.out.println("Edad: " + persona.getEdad()); 
        System.out.println("Genero: " + persona.getGenero()); */
        
        persona.imprimirDatos(); // se ve mas limpio
        
    }
    
}
