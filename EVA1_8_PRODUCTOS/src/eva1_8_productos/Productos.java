package eva1_8_productos;
public class Productos {
    
    // ATTIBUTOS
    
    private String nombre;
    private String marca;
    private String unidad;
    private double precio;
    private double cantidad;
    
    
    // CONSTRUCTOR DEFAULT
    public Productos(){
            nombre = "-----";
            marca = "-----";
            unidad = "-----";
            precio = 0.0;
            cantidad = 0.0;
    }
    
    // CONSTRUCTOR CON ARGUMENTOS
    public Productos(String nombre, String marca, String unidad, double precio, double cantidad){
        this.nombre = nombre;
        this.marca = marca;
        this.unidad = unidad;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void getMarca(String marca){
        this.marca = marca;
    }
    
    public String setUnidad(){
        return unidad;
    }
    
    public void getUnidad(String unidad){
        this.unidad = unidad;
    }
    
    public double setPrecio(){
        return precio;
    }
    
    public void getPrecio(double precio){
        this.precio = precio;
    }
    public double setCantidad(){
        return cantidad;
    }
    
    public void getCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    public void imprimirProducto(){
        System.out.println("Producto: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Unidades: " + unidad);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println();
    }
    
    public double calcularMonto(){
        return cantidad * precio;
    }
    
}

