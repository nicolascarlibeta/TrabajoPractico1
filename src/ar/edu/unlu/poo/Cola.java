package ar.edu.unlu.poo;

public class Cola {

    //ENCAPSULAMIENTO (NO se deben acceder a los atributos de la clase
    // por fuera de esta)
    private Nodo frente = null, fin = null;

    //INTERFAZ

    //esVacia()
    public boolean esVacia(){
        return frente == null;
    }

    //Encolar()
    public void encolar(Object elemento){
        Nodo nuevoNodo=new Nodo();
        nuevoNodo.setDatos(elemento);
        nuevoNodo.setSiguiente(null);
        if (frente == null){
            frente=nuevoNodo;
            fin=nuevoNodo;
        }
        else{
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
    }

    //Desencolar()
    public Object desencolar(){
        //Inicializamos las instancias de <CLASES>
        Object e=new Object();
        Nodo p=new Nodo();
        if (!esVacia()){
            p=frente;
            frente=p.getSiguiente();
            e=p.getDatos();
        }
        return e;
    }

    //Recuperar()
    public Object recuperar(){

        Object e = new Object();
        if (frente != null){
            e=frente.getDatos();
        }
        return e;

    }

    public String toString(){
        Nodo actual=new Nodo();
        String dato="";
        actual=frente;
        while(actual != null){
            dato=dato+actual.getDatos()+" ";
            actual=actual.getSiguiente();
        }
        return dato;
    }

}
