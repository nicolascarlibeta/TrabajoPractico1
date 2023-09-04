package ar.edu.unlu.poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {

    /*  //ESTRUCTURA

    Fecha

    //COMPORTAMIENTO

    EntreDosFechas()
    FechaMayor()
    FechaMenor()
    //Getters y Setters (COMUNICACIÓN CON OTRAS CLASES)
    getFecha()

    */
    private Date fecha;

    //CONSTRUCTOR
    public Fecha(String fechaString, String patron){
        SimpleDateFormat formato = new SimpleDateFormat(patron);
        try{
            fecha = formato.parse(fechaString);
        }
        catch (ParseException e){
            e.printStackTrace();
        }

    }

    //INTERFAZ

    public Date getFecha(){
        return fecha;
    }

    //EntreDosFechas()
    public boolean estaEntreDosFechas(Fecha fechaPre, Fecha fechaSuc){
        return fechaPre.getFecha().before(fecha) && fechaSuc.getFecha().after(fecha);
    }

    //FechaMayor()
    public boolean esMayorQue(Fecha fecha){
        return this.fecha.after(fecha.getFecha());
    }

    //FechaMenor()
    public boolean esMenorQue(Fecha fecha){
        return this.fecha.before(fecha.getFecha());
    }



}
