package eva1_1_clases;
public class EVA1_1_CLASES {
    public static void main(String[] args) {
        
        // Una clase sirve para crear objetos:
        // 1.- Declarar un identificador del tipo de dato
        Persona persona1;
        // 2.- Instanciar el objeto  --> new ( crea el onjeto en la memoria principal)
        // Identificador = new Nombre_de_la_clase(argumentos);
        persona1 = new Persona();
        System.out.println(persona1); // Referencia
        
        Persona persona2 = new Persona(); // Todo en una linea
        System.out.println(persona2);
        
        persona1.nombre = "Juancho";
        persona1.apellido = "Perez";
        persona1.edad = 53;
        persona1.imprimir();
        
        persona2.nombre = "David";
        persona2.apellido = "Vivero";
        persona2.edad = 18;
        persona2.imprimir();
        
        
    }
    
}
        // Clases inician en Mayúscula
        // MiClasePersona
        // Todas las clases son tipos de datos abstractos
class Persona {
    //Estado --> Datos ( Variables)  --> ATRIBUTOS
    String nombre;
    String apellido;
    int edad;
    //Comportamiento --> Métodos
    void imprimir () {
 
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Edad: " + edad);
    }
}