package ar.edu.unlu.poo;

public class ClaseEjercicio6 {

    //MayorCant.dePág.()
    public String mayorCantidadPaginas(Libro libro1, Libro libro2){

        if(libro1.getNumPaginas() > libro2.getNumPaginas()){
            return libro1.getTitulo();
        }
        else{
            return libro2.getTitulo();
        }
    }

}
