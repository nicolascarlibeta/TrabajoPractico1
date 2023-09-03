package ar.edu.unlu.poo;
import java.time.LocalDate;
import java.util.ArrayList;

public class ToDoList {

    //Ocultación de la información (Information Hiding)
    private ArrayList<Tarea> toDoList = new ArrayList<>();
    private ArrayList<Colaborador> colaboradores = new ArrayList<>();
    private int cantidad = 0;

    //INTERFAZ, MÉTODOS

    //Agregar()
    public void addTarea(String descripcion, LocalDate fechaLimite){
        //Creamos la tarea
        Tarea nuevaTarea = new Tarea(descripcion,fechaLimite);
        //La agrego a la lista de tareas
        toDoList.add(nuevaTarea);
        cantidad++;
    }

    public void addTarea(String descripcion, LocalDate fechaLimite, LocalDate fechaRecordatorio){
        //Creamos la tarea
        Tarea nuevaTarea = new Tarea(descripcion,fechaLimite,fechaRecordatorio);
        //La agrego a la lista de tareas
        toDoList.add(nuevaTarea);
        cantidad++;
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
        for(int i = 0; i < cantidad; i++){
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
        for(int i = 0; i < cantidad; i++){
            tareaActual = toDoList.get(i);
            if(!tareaActual.estaVencida()){
                listaOrdenada.add(tareaActual);
            }
        }

        return listaOrdenada;
    }


    public ArrayList<Tarea> getTDLporColaborador(String colaborador){
        ArrayList<Tarea> listaPorColaborador = new ArrayList<>();
        Tarea tareaActual = new Tarea("");
        for(int i = 0; i < cantidad; i++){
            tareaActual = toDoList.get(i);
            if(tareaActual.getColaborador().getNombreColaborador().equals(colaborador)){
                listaPorColaborador.add(tareaActual);
            }
        }
        return listaPorColaborador;
    }


    public boolean addColaborador(String nombreColaborador){
        if(colaboradores.contains())
    }


}
