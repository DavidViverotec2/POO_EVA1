package eva1_7_constructores;
public class EVA1_7_CONSTRUCTORES {

    public static void main(String[] args) {
                            // CONSTRUCTOR DEFAULT ( SIN ARGUMENTOS EN LOS PARÉNTESIS)
        Persona persona1 = new Persona();
        persona1.imprimirDatos();
        
        Persona persona2 = new Persona("David", "Vivero", 18);
        persona2.imprimirDatos();
    }
    
}
