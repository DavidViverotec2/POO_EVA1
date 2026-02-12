package eva1_8_productos;
public class EVA1_8_PRODUCTOS {
    public static void main(String[] args) {
        Productos producto1 = new Productos("Jugo de naranja", "Del Valle", "mls", 30, 500 );
        Productos producto2 = new Productos("Galletas de chocolate", "Chokis", "gr", 25, 57 );
        Productos producto3 = new Productos("Papitas de queso", "Doritos", "gr", 25, 100 );
        
        producto1.imprimirProducto();
        double monto = producto1.calcularMonto();
        System.out.println("Monto invertido en este producto: " + monto);
        
        producto2.imprimirProducto();
        producto3.imprimirProducto();
        
    }
    
}
