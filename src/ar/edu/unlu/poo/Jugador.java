package ar.edu.unlu.poo;

import java.util.ArrayList;

public class Jugador {
    /*
     //ESTRUCTURA

        Nombre del Jugador
        Palabra
        Puntaje Total

        //COMPORTAMIENTO

        Jugar()
        ObtenerGanador()
        //Getters y Setters (COMUNICACIÓN CON OTRAS CLASES)
        getPuntajeTotal()
        getNombreJugador()

        La clase Jugador se utiliza para instanciar un objeto del tipo Jugador,
        el cual puede obtener un Nombre de Jugador, su Palabra para competir
        y los puntos que vaya acumulando si la palabra es válida. Para determinar
        si es valida, le envia un mensaje a una instancia de la clase Diccionario
        para verificar que dicha palabra se encuentre alli. Ademas, esta clase
        puede enviar mensajes a otra instancia Jugador para determinar cuales
        de los dos jugadores acumularon mas puntos y determinar quien ganó el juego.

        */

    //Ocultación de la Información (INFORMATION HIDING)
    private String nombreJugador = "";
    private ArrayList<String> palabras = new ArrayList<>();
    private int puntajeTotal = 0;

    //INTERFAZ

    //Getters y Setters
    public int getPuntajeTotal(){
        return puntajeTotal;
    }

    public String getNombreJugador(){
        return nombreJugador;
    }

    public ArrayList<String> getPalabras(){
        return palabras;
    }

    //METODOS GENERALES
    public Jugador(String nombreJugador){
        this.nombreJugador = nombreJugador;
    }

    public int jugar(String palabra, Diccionario diccionario){
        int pts = 0;
        if(diccionario.contieneA(palabra)){
            this.palabras.add(palabra);
            pts = palabra.length();
            if(palabra.contains("k") || palabra.contains("K")){
                pts += 1;
            }
            if(palabra.contains("z") || palabra.contains("Z")){
                pts += 1;
            }
            if(palabra.contains("x") || palabra.contains("X")){
                pts += 1;
            }
            if(palabra.contains("y") || palabra.contains("Y")){
                pts += 1;
            }
            if(palabra.contains("w") || palabra.contains("W")){
                pts += 1;
            }
            if(palabra.contains("q") || palabra.contains("Q")){
                pts += 1;
            }
            puntajeTotal += pts;
        }
        return pts;
   }

   public Jugador getGanador(Jugador jugador2){
        if(this.puntajeTotal > jugador2.puntajeTotal){
            return this;
        }
        else{
            return jugador2;
        }
   }



}
