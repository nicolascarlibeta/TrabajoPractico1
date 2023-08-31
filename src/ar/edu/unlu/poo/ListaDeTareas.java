package ar.edu.unlu.poo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ListaDeTareas {

    //Ocultación de la información (Information Hiding)
    private final ArrayList<Tarea> listaDeTareas;
    private int cantidad = 0;

    public ListaDeTareas(){
        listaDeTareas = new ArrayList<>();
    }

    //INTERFAZ, MÉTODOS

    //AgregarTarea()
    public void nuevaTarea(String descripcion, LocalDate fechaLimite){
        //Creamos la tarea
        Tarea nuevaTarea = new Tarea();
        nuevaTarea.nueva(descripcion,fechaLimite);
        //La agrego a la lista de tareas
        listaDeTareas.add(nuevaTarea);
        cantidad++;
    }

    //MarcarComoTareaTerminada()
    public void tareaTerminada(int tarea){
        if(cantidad != 0 && tarea>=1){
            Tarea tareaActual = new Tarea();
            tareaActual = listaDeTareas.get(tarea-1);
            tareaActual.marcarComoTerminada();
            cantidad--;
        }
    }

    //CambiarPrioridadTarea()
    public void prioridad(int p, int tarea){
        if(cantidad != 0){
            listaDeTareas.get(tarea).cambiarPrioridad(p);
        }
    }

    //ModificarDescripciónTarea()
    public void editarTarea(String descripcion, int tarea){
        Tarea tareaActual = new Tarea();
        tareaActual = listaDeTareas.get(tarea-1);
        tareaActual.cambiarDescripcion(descripcion);
    }

    //MostrarListaDeTareas()
    public void mostrar(){
        Tarea tareaActual = new Tarea();
        System.out.println("Tareas: ");
        for(int i = 0; i < listaDeTareas.size(); i++){
            tareaActual = listaDeTareas.get(i);
            tareaActual.ver();
        }
    }


}
