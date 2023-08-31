package ar.edu.unlu.poo;

public class Libro {

    private String titulo;
    private String autor;
    private int numPaginas;
    private int ejemDisponibles;
    private int ejemPrestados;

    //INTERFAZ (MÉTODOS)

    //CONSTRUCTOR
    public Libro(String titulo, String autor, int pag, int ed, int ep){
        this.titulo = titulo;
        this.autor = autor;
        numPaginas = pag;
        ejemDisponibles = ed;
        ejemPrestados = ep;
    }

    //Getters y Setters (COMUNICACIÓN CON OTRAS CLASES)
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
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



}
