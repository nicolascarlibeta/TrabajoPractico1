package ar.edu.unlu.poo;
import java.time.LocalDate;

public class Tarea {

    private enum Prioridad{
        ALTA, MEDIA, BAJA;
    }
    private String descripcion;
    private boolean terminada;
    private LocalDate fechaLimite;
    private Prioridad prioridad = Prioridad.MEDIA;

    //NuevaTarea()
    public void nueva(String descripcion, LocalDate fechaLimite){
        //Uso de "this."
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        terminada = false;
    }

    //CambiarDescripción()
    public void cambiarDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    //CambiarPrioridad()
    public void cambiarPrioridad(int p){
        switch(p){
            case 1: prioridad = Prioridad.ALTA;
            break;
            case 2: prioridad = Prioridad.MEDIA;
            break;
            case 3: prioridad = Prioridad.BAJA;
            break;
        }
    }

    //MarcarTerminada()
    public void marcarComoTerminada(){
        terminada = true;
    }

    //Ver()
    public void ver(){
        String descripcion = this.descripcion;
        if(fechaLimite.isBefore(LocalDate.now()) & !terminada){
            descripcion="(Vencida) " + descripcion;
        }
        else if(terminada){
            descripcion = "(Completada) " + descripcion;
        }
        System.out.println(descripcion);
    }

    //estaVencida()
    public boolean estaVencida(){
        return fechaLimite.isAfter(LocalDate.now());
    }

    //estaTerminada()
    public boolean estaTerminada(){
        return terminada;
    }



}

