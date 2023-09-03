package ar.edu.unlu.poo;

public class Libro {

/*  //ESTRUCTURA

    Título
    Autor
    Año
    Páginas
    Ejemplares Disponibles
    Ejemplares Prestados
    ISBN

    //COMPORTAMIENTO

    VerDescripción()
    PrestarLibro()
    DevolverLibro()
    Getters y Setters (COMUNICACIÓN CON OTRAS CLASES)

    //RESPONSABILIDAD

    * Crear instancias de Libros
    * Permitir la modificación y consulta de los datos de una instancia Libro
    * Establecer el estado de prestado o devuelto de una instancia Libro


    */

    private String titulo;
    private String autor;
    private String isbn;
    private int anio;
    private int numPaginas;
    private int ejemDisponibles;
    private int ejemPrestados;

    //INTERFAZ (MÉTODOS)

    //CONSTRUCTOR
    public Libro(String titulo, String autor, int pag, int ed, int ep, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        numPaginas = pag;
        ejemDisponibles = ed;
        ejemPrestados = ep;
        this.isbn = isbn;
    }

    //Getters y Setters (COMUNICACIÓN CON OTRAS CLASES)
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getNumPaginas(){
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }

    public void setEjemDisponibles(int ed){
        ejemDisponibles = ed;
    }
    public int getEjemDisponibles(){
        return ejemDisponibles;
    }

    public void setEjemPrestados(int ep){
        ejemPrestados = ep;
    }
    public int getEjemPrestados(){
        return ejemPrestados;
    }

    //VerDescripción()
    public void verDescripcion(){
        System.out.println(
                "El libro " + titulo + " creado por el autor " + autor + " tiene " + numPaginas + " páginas, quedan " + ejemDisponibles + " disponibles y se prestaron " + ejemPrestados + "."
        );
    }

    //PrestarLibro()
    public void prestar(){
        if(ejemDisponibles > 1){
            ejemPrestados += 1;
            ejemDisponibles -= 1;
        }
        else{
            System.out.println("<NO se puede prestar este libro, solo queda (un) ejemplar.>");
        }
    }

    //DevolverLibro()
    public void devolver(){
        if(ejemDisponibles > 0){
            ejemPrestados -= 1;
            ejemDisponibles += 1;
        }
    }


}
