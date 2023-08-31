package ar.edu.unlu.poo;

//Creamos la Clase <NODO>
public class Nodo {
    private Object datos;
    private Nodo siguiente = null;

    //Vamos a implementar los METODOS de los nodos, de forma que solo se puedan acceder a sus
    //datos de forma publica, sin afectar la privacidad de los datos

    //INTERFAZ:

    //Getters y Setters (Mecanismos de asignación y visualización de datos privados)
    //SET (CARGAR el DATO, Set = Cargar, Setear, Inicializar)
    public void setDatos(Object datos){
        //Como el atributo tiene el MISMO NOMBRE que el parámetro, utilizamos la expresión <this>
        //Se lee como "mi.dato es igual al parámetro <datos>"
        this.datos = datos;
    }

    //GET (OBTENER el DATO, RETORNAR el DATO, RECIBIR el DATO)
    public Object getDatos(){
        return datos;
    }

    //SET
    //Estructura: <public,private,etc.> <¿static?> <valor de retorno> <nombre>
    public void setSiguiente(Nodo nodo){
        siguiente = nodo;
    }

    //GET
    public Nodo getSiguiente(){
        return siguiente;
    }

}