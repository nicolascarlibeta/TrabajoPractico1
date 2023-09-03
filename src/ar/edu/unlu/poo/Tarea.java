package ar.edu.unlu.poo;
import java.time.LocalDate;

public class Tarea {
    /*  //ESTRUCTURA

        Descripción
        Colaborador
        Estado (Completa e Incompleta)
        Fecha Límite
        Fecha de Recordatorio
        Fecha de Finalización
        Prioridad

        //COMPORTAMIENTO

        MarcarComoTerminada()
        estaVencida(): Booleano
        estaTerminada(): Booleano
        Getters y Setters (COMUNICACIÓN CON OTRAS CLASES)

        */
    private enum Prioridad{
        ALTA, MEDIA, BAJA;
    }
    private String descripcion;
    private Colaborador colaborador;
    private boolean terminada;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;
    private LocalDate fechaFinalizacion;
    private Prioridad prioridad = Prioridad.MEDIA;

    //INTERFAZ

    //NuevaTarea() (CONSTRUCTORES)
    public Tarea(String descripcion, LocalDate fechaLimite){
        if(fechaLimite.isBefore(LocalDate.now()) & !terminada){
            this.descripcion = "(Vencida) " + descripcion;
        }
        else if(terminada){
            this.descripcion = "(Completada) " + descripcion;
        }
        else{
            this.descripcion = descripcion;
        }
        this.fechaLimite = fechaLimite;
        terminada = false;
    }

    public Tarea(String descripcion, LocalDate fechaLimite, LocalDate fechaRecordatorio){
        if(fechaLimite.isBefore(LocalDate.now()) & !terminada){
            this.descripcion = "(Vencida) " + descripcion;
        }
        else if(fechaRecordatorio.isAfter(LocalDate.now()) || fechaRecordatorio.isEqual(LocalDate.now())){
            this.descripcion = "(Por vencer)" + descripcion;
            prioridad = Prioridad.ALTA;
        }
        else if(terminada){
            this.descripcion = "(Completada) " + descripcion;
        }
        else{
            this.descripcion = descripcion;
        }
        this.fechaLimite = fechaLimite;
        this.fechaRecordatorio = fechaRecordatorio;
        terminada = false;
    }

    public Tarea(String descripcion){
        if(fechaLimite.isBefore(LocalDate.now()) & !terminada){
            this.descripcion = "(Vencida) " + descripcion;
        }
        else if(fechaRecordatorio.isAfter(LocalDate.now()) || fechaRecordatorio.isEqual(LocalDate.now())){
            this.descripcion = "(Por vencer)" + descripcion;
            prioridad = Prioridad.ALTA;
        }
        else if(terminada){
            this.descripcion = "(Completada) " + descripcion;
        }
        else{
            this.descripcion = descripcion;
        }
        terminada = false;
    }

    //Setters y Getters

    //Descripción
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }

    //Prioridad
    public void setPrioridad(int p){
        switch(p){
            case 1: prioridad = Prioridad.ALTA;
            break;
            case 2: prioridad = Prioridad.MEDIA;
            break;
            case 3: prioridad = Prioridad.BAJA;
            break;
        }
    }
    public Prioridad getPrioridad(){
        return prioridad;
    }

    //FechaLimite
    public void setFechaLimite(LocalDate fechaLimite){
        this.fechaLimite = fechaLimite;
    }
    public LocalDate getFechaLimite(){
        return fechaLimite;
    }

    //FechaRecordatorio
    public void setFechaRecordatorio(LocalDate recordatorio){
        if(fechaRecordatorio.isAfter(LocalDate.now()) || fechaRecordatorio.isEqual(LocalDate.now())){
            this.descripcion = "(Por vencer)" + descripcion;
            prioridad = Prioridad.ALTA;
        }
        fechaRecordatorio = recordatorio;
    }

    //Colaborador
    public Colaborador getColaborador(){
        return colaborador;
    }


    //METODOS GENERALES

    //MarcarComoTerminada()
    public void marcarComoTerminada(String colaborador){

        terminada = true;
        fechaFinalizacion = LocalDate.now();
    }


    //VERIFICAR SI...

    //estaVencida()
    public boolean estaVencida(){
        return fechaLimite.isBefore(LocalDate.now());
    }

    //estaTerminada()
    public boolean estaTerminada(){
        return terminada;
    }


}

