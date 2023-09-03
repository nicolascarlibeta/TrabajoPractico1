package ar.edu.unlu.poo;

import java.util.ArrayList;

public class Biblioteca {

    /*  //ESTRUCTURA

    Estanteria

    //COMPORTAMIENTO

    CargarLibro()
    VerEstanteria()
    BuscarLibro()
    MostrarLibrosPorTitulo()
    CantidadTotalDePrestamos()

    //RESPONSABILIDAD

    * Crear instancias de Biblioteca
    * Permitir añadir una instancia de la clase Libro a una instancia Biblioteca
    * Permitir buscar una instancia de la clase Libro
    * Mostrar los datos de una instancia Libro por titulo
    * Mostrar la cantidad total de prestamos que se efectuan en una instancia Biblioteca

    */


    //Debemos primero INICIALIZAR la variable de ArrayList
    private final ArrayList<Libro> estanteria = new ArrayList<>();

    //INTERFAZ

    //CargarLibro()
    public void cargar(Libro libro){
        if(buscar(libro.getTitulo()) == null){
            estanteria.add(libro);
        }
    }

    //VerEstanteria()
    public void ver(){
        for(int i = 0; i < estanteria.size(); i++){
            System.out.println(estanteria.get(i));
        }
    }

    //BuscarLibro()
    public Libro buscar(String titulo){
        boolean esta = false;
        int posicion = 0, i = 0;
        Libro libroActual = null;
        while(!esta && i < estanteria.size() && estanteria.size() != 0){
            libroActual = estanteria.get(i);
            if(libroActual.getTitulo().equals(titulo)){
                esta = true;
            }
            i++;
        }
        if(!esta){
            libroActual = null;
        }
        return libroActual;
    }

    //MostrarLibrosPorTitulo()
    public void mostrarLibrosPorTitulo(String titulo){
        Libro libroAMostrar = buscar(titulo);
        if(libroAMostrar != null){
            libroAMostrar.verDescripcion();
        }
        else{
            System.out.println("<El libro no se encuentra o no esta disponible.>");
        }
    }

    //CantidadTotalDePrestamos()
    public void totalPrestamos(){
        int cantPrestamos = 0;
        for(int i = 0; i < estanteria.size(); i++){
            cantPrestamos += estanteria.get(i).getEjemPrestados();
        }
        System.out.println("La cantidad Total de prestamos es de " + cantPrestamos + ".");
    }

}
