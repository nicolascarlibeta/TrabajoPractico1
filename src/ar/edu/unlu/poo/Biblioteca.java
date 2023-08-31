package ar.edu.unlu.poo;

import java.util.ArrayList;

public class Biblioteca {

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
            estanteria.get(i).verDescripcion();
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

    //PrestarLibro()
    public void prestar(String titulo){
      Libro libroAPrestar = buscar(titulo);
      if(libroAPrestar == null){
          System.out.println("<El libro no se encuentra o no esta disponible.>");
      }
      else if(libroAPrestar.getEjemDisponibles() > 1){
          libroAPrestar.setEjemPrestados(libroAPrestar.getEjemPrestados()+1);
          libroAPrestar.setEjemDisponibles(libroAPrestar.getEjemDisponibles()-1);
      }
      else{
          System.out.println("<NO se puede prestar este libro, solo queda (un) ejemplar.>");
      }
    }

    //DevolverLibro()
    public void devolver(String titulo){
      Libro libroADevolver = buscar(titulo);
      if(libroADevolver == null){
          System.out.println("<El libro no se encuentra o no esta disponible.>");
      }
      else{
          libroADevolver.setEjemPrestados(libroADevolver.getEjemPrestados()-1);
          libroADevolver.setEjemDisponibles(libroADevolver.getEjemDisponibles()+1);
      }
    }

    //VerDescripciónLibro()
    public void verDescripcionLibro(String titulo){
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
