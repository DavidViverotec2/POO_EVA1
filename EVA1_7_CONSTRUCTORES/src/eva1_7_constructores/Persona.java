package eva1_7_constructores;

public class Persona {
    // ATRIBUTOS
    private String nombre;
    private String apellidos;
    private int edad;
    
    // Constructores
    // Modificadores de acceso NOMBRE_CLASE(ARGUMENTOS){CUERPO DEL CONSTRUCTOR}
    
    public Persona(){
            // SE USAN PARA INICIALIZAR LOS OBJETOS
            System.out.println("EJECUCION DEL CONSTRUCTOR");
            nombre = "-----";
            apellidos = "-----";
            edad = -1;
    }
        // FIRMA
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellidos = apellido;
        this.edad = edad;
        
        // This --> Apuntador a todo el contenido del objeto
        // Metodos y atributos definidos en la clase, SIN IMPORTAR
    }
    
    /*
        SOBRECARGA DE METODOS
        UN METODO CREADO CON EL MISMO NOMBRE QUE OTRO PERO OTROS PARAMETROS
    */
    
    // COMPORTAMIENTO
    
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
    
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre); 
        System.out.println("Apellidos: " + apellidos); 
        System.out.println("Edad: " + edad); 
    }
}
