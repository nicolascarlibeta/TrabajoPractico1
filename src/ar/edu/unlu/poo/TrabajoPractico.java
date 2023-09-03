package ar.edu.unlu.poo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TrabajoPractico {

    //MayorCant.dePág.()
    public String mayorCantidadPaginas(Libro libro1, Libro libro2){

        if(libro1.getNumPaginas() > libro2.getNumPaginas()){
            return libro1.getTitulo();
        }
        else{
            return libro2.getTitulo();
        }
    }

    public void ejercicio1(){

        LocalDate fechaLimite = LocalDate.now();
        //FECHA DE AYER
        LocalDate fechaAyer = LocalDate.now().minusDays(1);
        Tarea tarea1 = new Tarea("Ir al supermercado mañana.",fechaLimite);
        Tarea tarea2 = new Tarea("Consultar repuesto del auto.",fechaAyer);
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel.",fechaAyer);
        //tarea2.marcarComoTerminada();
        System.out.println(tarea1.getDescripcion());
        System.out.println(tarea2.getDescripcion());
        System.out.println(tarea3.getDescripcion());

    }

    public void ejercicio6(){

        LocalDate fechaLimite = LocalDate.now();
        //FECHA DE AYER
        LocalDate fechaAyer = LocalDate.now().minusDays(1);
        Tarea tarea1 = new Tarea("Ir al supermercado mañana.",fechaLimite);
        Tarea tarea2 = new Tarea("Consultar repuesto del auto.",fechaAyer);
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel.",fechaAyer);
        //tarea2.marcarComoTerminada();
        System.out.println(tarea1.getDescripcion());
        System.out.println(tarea2.getDescripcion());
        System.out.println(tarea3.getDescripcion());

    }

    public void ejercicio7(){

        Ecuacion2doGrado ecuacion1 = new Ecuacion2doGrado(2,5,2);
        Ecuacion2doGrado ecuacion2 = new Ecuacion2doGrado(4,4,1);
        Ecuacion2doGrado ecuacion3 = new Ecuacion2doGrado(0,4,3);
        System.out.println(" ");
        ecuacion1.mostrar();
        System.out.println("Las raices de la ecuación son: " + ecuacion1.resolvente());
        System.out.println("La solución a la ecuación es: " + ecuacion1.solucion(-3));
        System.out.println(" ");
        ecuacion2.mostrar();
        System.out.println("Las raices de la ecuación son: " + ecuacion2.resolvente());
        System.out.println("La solución a la ecuación es: " + ecuacion2.solucion(1));
        System.out.println(" ");
        ecuacion3.mostrar();
        System.out.println("Las raices de la ecuación son: " + ecuacion3.resolvente());
        System.out.println("La solución a la ecuación es: " + ecuacion3.solucion(0));

    }

    public void ejercicio8(){

        int longitud = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, ingrese una longitud para las contraseñas: ");
        longitud = teclado.nextInt();
        ArrayList<Password> coleccion = new ArrayList<>();
        Password contra1 = new Password(longitud);
        Password contra2 = new Password(longitud);
        Password contra3 = new Password(longitud);
        Password contra4 = new Password(longitud);
        Password contra5 = new Password(longitud);
        if(longitud >= 8){
            coleccion.add(contra1);
            coleccion.add(contra2);
            coleccion.add(contra3);
            coleccion.add(contra4);
            coleccion.add(contra5);
            System.out.println("<" + coleccion.get(0).getPassword() + "> - " + coleccion.get(0).estadoPassword());
            System.out.println("<" + coleccion.get(1).getPassword() + "> - " + coleccion.get(1).estadoPassword());
            System.out.println("<" + coleccion.get(2).getPassword() + "> - " + coleccion.get(2).estadoPassword());
            System.out.println("<" + coleccion.get(3).getPassword() + "> - " + coleccion.get(3).estadoPassword());
            System.out.println("<" + coleccion.get(4).getPassword() + "> - " + coleccion.get(4).estadoPassword());
        }
    }

    public void ejercicio9(){

        Fecha fecha1 = new Fecha("06-12-2005","dd-MM-yyyy");
        Fecha fecha2 = new Fecha("03-14-1998","MM-dd-yyyy");
        Fecha fecha3 = new Fecha("02-01-2009","dd-MM-yyyy");

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Fechas creadas: ");
        System.out.println("fecha1: "+formato.format(fecha1.getFecha()));
        System.out.println("fecha2: "+formato.format(fecha2.getFecha()));
        System.out.println("fecha3: "+formato.format(fecha3.getFecha()));

        if(fecha1.estaEntreDosFechas(fecha2,fecha3)){
            System.out.println("fecha1 ESTA entre la fecha2 y fecha3");
        }

        if(!fecha2.estaEntreDosFechas(fecha1,fecha3)){
            System.out.println("fecha2 NO ESTA entre la fecha1 y fecha3");
        }

        if(fecha1.esMayorQue(fecha2)){
            System.out.println("fecha1 es MAYOR que fecha2");
        }

        if(!fecha1.esMenorQue(fecha2)){
            System.out.println("fecha1 NO es MENOR que fecha2");
        }

        if(fecha1.esMenorQue(fecha3)){
            System.out.println("fecha1 es MENOR que fecha3");
        }

    }


}
