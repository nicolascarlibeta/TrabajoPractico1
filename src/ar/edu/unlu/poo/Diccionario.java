package ar.edu.unlu.poo;

import java.util.ArrayList;

public class Diccionario {
    /*
         //ESTRUCTURA

            Palabras (Diccionario)

            //COMPORTAMIENTO

            AgregarPalabra()
            RemoverPalabra()
            ReemplazarPalabra()
            ContieneLaPalabra(): Booleano

            La clase Diccionario se comunica con una instancia de la Clase Jugador
            para determinar si una palabra guardada como dato en dicha instancia sea
            o no valida. Para ello, existe el metodo ContieneA(), el cual a traves
            de un mensaje enviado por la Clase Jugador, le enviamos la palabra, mientras
            que el metodo retornara verdadero si la palabra es valida y viceversa.
            Un diccionario puede estar asociado a MUCHOS JUGADORES.


            */
    private ArrayList<String> palabras = new ArrayList<>();

    //INTERFAZ
    public boolean addPalabras(String nuevaPalabra){
        if(!palabras.contains(nuevaPalabra)){
            return palabras.add(nuevaPalabra);
        }
        return false;
    }

    public boolean removePalabras(String palabraABorrar){
        return palabras.remove(palabraABorrar);
    }

    public boolean replacePalabra(String palabraBuscada, String palabraModificada){
        if(palabras.contains(palabraBuscada)){
            palabras.set(palabras.indexOf(palabraBuscada), palabraModificada);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean contieneA(String palabraBuscada){
        return palabras.contains(palabraBuscada);
    }

    //Getters y Setters
    public ArrayList<String> getPalabras(){
        return palabras;
    }

    //MostrarDiccionario()
    public String toString(){
        String dato = "", actual = palabras.get(0);
        int i = 1;
        while(i < palabras.size()){
            dato += actual + ". ";
            actual = palabras.get(i);
            i++;
        }
        dato += actual + "\n";
        return dato;
    }



}
