package ar.edu.unlu.poo;

public class Colaborador {

    //ESTRUCTURA (INFORMATION HIDING)
    private String nombreColaborador = "";


    //CONSTRUCTOR
    public Colaborador(String nombreColaborador){
        this.nombreColaborador = nombreColaborador;
    }

    //INTERFAZ

    //Getters y Setters
    public String getNombreColaborador(){
        return nombreColaborador;
    }

    public void setNombreColaborador(String nombreColaborador){
        this.nombreColaborador = nombreColaborador;
    }

}
