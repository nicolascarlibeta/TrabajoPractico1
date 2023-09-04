package ar.edu.unlu.poo;

/* RESPONSABILIDAD
* Servir como estructura de Pila para guardar instancias de Nodos,
* ofreciendo diferentes metodos para la administracion de los datos que se guardan
* en la misma.
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

    //MostrarPila()
    public String toString(){
        Nodo actual=new Nodo();
        String dato="";
        actual = tope;
        while(actual != null){
            dato = dato + actual.getDatos() + "\n";
            actual = actual.getSiguiente();
        }
        return dato;
    }


} //Fin de Interfaz

