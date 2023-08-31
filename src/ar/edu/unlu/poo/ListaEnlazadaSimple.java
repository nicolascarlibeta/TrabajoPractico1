package ar.edu.unlu.poo;

//Creamos la Clase <LISTA>


//################################################################

public class ListaEnlazadaSimple {
    private Nodo inicio = null;
    //¡NO utilizamos un campo <cantidad>!
    //private int cantidad=0;

//################################################################

    //INTERFAZ, METODOS:

    //Estructura: <public,private,etc.> <¿static?> <valor de retorno> <nombre>

    //EsVacia()
    public boolean esVacia(){
        return inicio == null;
    }

    //Longitud()
    public int longitud(){
        int longitud=0;
        Nodo actual = inicio;
        while(actual != null){
            longitud+=1;
            actual=actual.getSiguiente();
        }
        return longitud;
    }

    //Agregar()
    public void agregar(Object elemento){
        //Creamos el nodo
        Nodo nuevoNodo=new Nodo();
        nuevoNodo.setDatos(elemento);
        nuevoNodo.setSiguiente(null);
        //Lo agregamos al final de la lista
        //Si es el primer elemento...
        if(inicio == null){
            inicio = nuevoNodo;
        }
        else{
            //Creamos un OBJETO o INSTANCIA de la Clase <NODO>
            Nodo actual=new Nodo();
            //Guardamos en un Objeto "auxiliar" el Primer NODO
            actual=inicio;
            while(actual.getSiguiente() != null){
                actual=actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }

    }

    //Eliminar()
    public void eliminar(int pos) {
        Nodo actual = inicio;
        if (pos == 1) {
            inicio = actual.getSiguiente();
        }
        else {
            for (int i = 0; i < pos - 2; i++) {
                actual = actual.getSiguiente();
            }
            Nodo temp = actual.getSiguiente();
            actual.setSiguiente(temp.getSiguiente());
        }
    }

    //Recuperar()
    public Object recuperar(int pos) {
        Nodo actual = inicio;
        for (int i = 0; i < pos - 1; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getDatos();
    }

    //Insertar()
    public void insertar(Object elemento, int pos) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDatos(elemento);
        nuevoNodo.setSiguiente(null);
        if (pos == 1) {
            nuevoNodo.setSiguiente(inicio);
            inicio = nuevoNodo;
        } else {
            Nodo temp = inicio;
            for (int i = 0; i < pos - 2; i++) {
                temp = temp.getSiguiente();
            }
            nuevoNodo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevoNodo);
        }
    }


    //MostrarLista()

    //Se modifica un método pre-existente (toString)
    //Modificamos toString para poder mostrar los datos del <OBJETO>
    public String toString(){
        Nodo actual=new Nodo();
        String dato="";
        actual=inicio;
        while(actual != null){
            dato=dato+actual.getDatos()+" ";
            actual=actual.getSiguiente();
        }
        return dato;
    }


} //Fin de Interfaz
