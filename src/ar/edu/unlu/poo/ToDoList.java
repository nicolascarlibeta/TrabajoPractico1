package ar.edu.unlu.poo;
import java.time.LocalDate;
import java.util.ArrayList;

public class ToDoList {

    //Ocultación de la información (Information Hiding)
    private ArrayList<Tarea> toDoList = new ArrayList<>();
    private int longitud = 0;

    //INTERFAZ, MÉTODOS

    //Agregar()
    public void addTarea(Tarea nuevaTarea){
        toDoList.add(nuevaTarea);
        longitud++;
    }


    //METODOS GENERALES

    public Tarea buscar(String descripcionTarea){
        int i = 0;
        boolean esta = false;
        Tarea tareaBuscada = null;
        while(!esta){
            tareaBuscada = toDoList.get(i);
            if(tareaBuscada.getDescripcion().equals(descripcionTarea)){
                esta = true;
            }
            i++;
        }
        return tareaBuscada;
    }


    public ArrayList<Tarea> getTDLOrdenadaPorPrioridad(){
        ArrayList<Tarea> listaOrdenada = new ArrayList<>();
        Tarea tareaActual = new Tarea("");
        for(int i = 0; i < longitud; i++){
            tareaActual = toDoList.get(i);
            if(!tareaActual.estaVencida()){
                listaOrdenada.add(tareaActual);
            }
        }
        //Ordenar
        return listaOrdenada;
    }


    public ArrayList<Tarea> getTDLOrdenadaPorVencimiento(){
        ArrayList<Tarea> listaOrdenada = new ArrayList<>();
        Tarea tareaActual = new Tarea("");
        for(int i = 0; i < longitud; i++){
            tareaActual = toDoList.get(i);
            if(!tareaActual.estaVencida()){
                listaOrdenada.add(tareaActual);
            }
        }

        return listaOrdenada;
    }


    public ArrayList<Tarea> getTDLporColaborador(String nombreColaborador){
        ArrayList<Tarea> listaPorColaborador = new ArrayList<>();
        Tarea tareaActual = new Tarea("");
        for(int i = 0; i < longitud; i++){
            tareaActual = toDoList.get(i);
            if(tareaActual.getColaborador().getNombreColaborador().equals(nombreColaborador)){
                listaPorColaborador.add(tareaActual);
            }
        }
        return listaPorColaborador;
    }


    //MostrarToDoList()
    public String toString(){
        String dato = "";
        Tarea actual = toDoList.get(0);
        int i = 1;
        while(i < toDoList.size()){
            dato = dato + actual.getDescripcion() + ", ";
            actual = toDoList.get(i);
            i++;
        }
        dato += actual + "\n";;
        return dato;
    }




}
