package ar.edu.unlu.poo;

/*Un OBJETO debe poseer 3 caracteristicas:
 * Estado (CARACTERÍSTICAS, ATRIBUTOS)
 * Comportamiento (MÉTODOS)
 * Identidad (UNICIDAD, DISTINCIÓN)
 */
public class Pila{

    //OCULTACIÓN
    // * ESTADO
    private Nodo tope = null;

    //INTERFAZ

    //esVacia()
    public boolean esVacia(){
        return tope == null;
    }

    //Apilar()
    public void apilar(Object elemento){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDatos(elemento);
        nuevoNodo.setSiguiente(tope);
        tope = nuevoNodo;
    }

    //Desapilar()
    public Object desapilar(){
        Object elemento = new Object();
        if(tope == null){
            elemento = null;
        }
        else{
            Nodo topeActual = tope;
            elemento = topeActual.getDatos();
            tope = topeActual.getSiguiente();
        }
        return elemento;
    }

    //Tope()
    public Object tope(){
        return tope.getDatos();
    }


} //Fin de Interfaz

