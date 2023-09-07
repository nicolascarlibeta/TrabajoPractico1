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

    //Getters y Setters
    public int getLongitud(){
        return longitud;
    }

    public Tarea getTarea(int numeroTarea){
        return toDoList.get(numeroTarea);
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


    public void getToDoList(){
        //Ordenar por PRIORIDAD
        Tarea tareaActual = new Tarea("");
        for(int i = 1; i < longitud - 1; i++){
            for(int k = 0; k < longitud - 1; k++){
                if(toDoList.get(k).getPrioridad().ordinal() >
                        toDoList.get(k+1).getPrioridad().ordinal()){
                    tareaActual = toDoList.get(k);
                    toDoList.set(k,toDoList.get(k+1));
                    toDoList.set(k+1,tareaActual);
                }

            }
        }
    }


    public void getTDLporColaborador(String nombreColaborador){
        Tarea tareaActual = new Tarea("");
        boolean esta = false;
        System.out.println("Tareas completadas por " + nombreColaborador + ":");
        for(int i = 0; i < longitud; i++){
            tareaActual = toDoList.get(i);
            if((tareaActual.getColaborador() != null) && (tareaActual.getColaborador().getNombreColaborador().equals(nombreColaborador))){
                System.out.print(tareaActual);
                if(!esta){
                    esta = true;
                }
            }
        }
        if(!esta){
            System.out.println("<No existe ningun colaborador que coincida con el nombre " + nombreColaborador + ".>");
        }
    }




}
