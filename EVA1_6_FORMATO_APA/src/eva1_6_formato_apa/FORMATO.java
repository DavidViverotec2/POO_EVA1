package eva1_6_formato_apa;
public class FORMATO {
    private String autor;
    private String titulo;
    private int year;
    private String ciudad;
    private String estado;
    private String pais;
    private String editorial;
    private int paginas;
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String valor){
        autor = valor;
    }
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String valor){
        titulo = valor;
    }
    public int getYear(){
        return year;
    }
    
    public void setYear(int valor){
        year = valor;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public void setCiudad(String valor){
        ciudad = valor;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String valor){
        estado = valor;
    }
    
    public String getPais(){
        return pais;
    }
    
    public void setPais(String valor){
        pais = valor;
    }
    
    public String getEditorial(){
        return editorial;
    }
    
    public void setEditorial(String valor){
        editorial = valor;
    }
    
    public int getPaginas(){
        return paginas;
    }
    
    public void setPaginas(int valor){
        paginas = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("---------------- Libro ----------------");
        
        System.out.println("Autor del libro: " + autor);
        System.out.println("Titulo del libro: " + titulo);
        System.out.println("Año de publicacion del libro: " + year);
        System.out.println("Ciudad de origen: " + ciudad);
        System.out.println("Estado de origen: " + estado);
        System.out.println("Pais de origen: " + pais);
        System.out.println("Editorial del libro: " + editorial);
        System.out.println("No. de paginas del libro: " + paginas);
    }
    
    public void fichaBibliografica(){
        System.out.println(autor + ". (" + year + "). " + titulo + ". Editorial " + editorial);
    }
}
