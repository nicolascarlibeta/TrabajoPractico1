package ar.edu.unlu.poo;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Tarea {
    /*
    DIAGRAMA DE CLASE <TAREA>

        Tarea
    ---------------
    - descripción: String
    - colaborador
    - terminada: Boolean
    - fechaLimite: Date
    - fechaRecordatorio: Date
    - fechaFinalizacion: Date
    - prioridad: enum
    ----------------
    + MarcarComoTerminada()
    + estaVencida(): Boolean
    + estaTerminada(): Boolean
    + Getters y Setters (COMUNICACIÓN CON OTRAS CLASES)

        */
    public enum Prioridad{
        ALTA, MEDIA, BAJA;
    }
    private String descripcion;
    private Colaborador colaborador;
    private boolean terminada;
    private LocalDate fechaLimite = null;
    private LocalDate fechaRecordatorio = null;
    private LocalDate fechaFinalizacion = null;
    private Prioridad prioridad = Prioridad.MEDIA;

    //INTERFAZ

    //NuevaTarea() (CONSTRUCTORES)
    public Tarea(String descripcion, LocalDate fechaLimite){
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        terminada = false;
    }

    public Tarea(String descripcion, LocalDate fechaLimite, LocalDate fechaRecordatorio){
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        if(fechaRecordatorio.isAfter(LocalDate.now()) || fechaRecordatorio.isEqual(LocalDate.now())){
            prioridad = Prioridad.ALTA;
        }
        this.fechaRecordatorio = fechaRecordatorio;
        terminada = false;
    }

    public Tarea(String descripcion){
        this.descripcion = descripcion;
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
        Prioridad[] pArray = Prioridad.values();
        if(p >= 1 && p <= 3){
            prioridad = pArray[p-1];
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
            prioridad = Prioridad.ALTA;
        }
        fechaRecordatorio = recordatorio;
    }
    public LocalDate getFechaRecordatorio(){
        return fechaRecordatorio;
    }

    //Colaborador
    public Colaborador getColaborador(){
        return colaborador;
    }


    //METODOS GENERALES

    //MarcarComoTerminada()
    public void marcarComoTerminada(String nombreColaborador, LocalDate fechaFinalizacion){
        this.colaborador = new Colaborador(nombreColaborador);
        terminada = true;
        this.fechaFinalizacion = fechaFinalizacion;
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

    //MostrarTarea()
    public String toString(){
        String descripcion = "";
        if(fechaLimite.isBefore(LocalDate.now()) & !terminada){
            descripcion = "(Vencida) " + this.descripcion + " - Fecha Límite: " + fechaLimite + " - " + prioridad + "\n";
        }
        else if((fechaRecordatorio != null) && (fechaRecordatorio.isAfter(LocalDate.now()) || fechaRecordatorio.isEqual(LocalDate.now()))){
            descripcion = "(Por vencer) " + this.descripcion + " - Fecha Límite: " + fechaLimite + " - " + prioridad + "\n";
        }
        else if(terminada){
            descripcion = "(Completada por " + colaborador.getNombreColaborador() + " el dia " + fechaFinalizacion + ") " + this.descripcion + " - " + prioridad + "\n";
        }
        else{
            descripcion = this.descripcion + " - Fecha Límite: " + fechaLimite + " - " + prioridad + "\n";
        }
        return descripcion;
    }


}

