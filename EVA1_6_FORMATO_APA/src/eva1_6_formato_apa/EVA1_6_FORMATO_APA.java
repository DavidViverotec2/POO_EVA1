package eva1_6_formato_apa;
public class EVA1_6_FORMATO_APA {
    public static void main(String[] args) {
        FORMATO[] libros = new FORMATO[3];
        libros[0] = new FORMATO();
        libros[0].setAutor("Carl Sagan");
        libros[0].setTitulo("Cosmos");
        libros[0].setYear(1980);
        libros[0].setCiudad("Brooklyn");
        libros[0].setEstado("Nueva York");
        libros[0].setPais("Estados Unidos");
        libros[0].setEditorial("Planeta");
        libros[0].setPaginas(384);
        libros[0].fichaBibliografica();
        
        libros[1] = new FORMATO();
        libros[1].setAutor("Saint-Exupéry");
        libros[1].setTitulo("El principito");
        libros[1].setYear(1943);
        libros[1].setCiudad("Lyon");
        libros[1].setEstado("Lyon");
        libros[1].setPais("Francia");
        libros[1].setEditorial("Penguin Random House / Ediciones Leyenda");
        libros[1].setPaginas(100);
        libros[1].fichaBibliografica();
        
        libros[1] = new FORMATO();
        libros[1].setAutor("Jane Austen");
        libros[1].setTitulo("Pride and Prejudice");
        libros[1].setYear(1813);
        libros[1].setCiudad("Winchester");
        libros[1].setEstado("Hampshire ");
        libros[1].setPais("Reino Unido");
        libros[1].setEditorial("Alba Editorial");
        libros[1].setPaginas(424);
        libros[1].fichaBibliografica();
    }
    
}
