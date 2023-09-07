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

        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.agregar("Hola");
        lista.agregar("mundo");
        lista.agregar("!");
        System.out.println(lista);
        lista.insertar("¡",1);
        System.out.println(lista);
        lista.agregar("!");
        System.out.println(lista);
        lista.eliminar(2);
        System.out.println(lista);

    }

    public void ejercicio3(){

        Pila pila = new Pila();
        pila.apilar("Hola");
        pila.apilar("mundo");
        pila.apilar("!");
        System.out.println(pila);
        pila.apilar("¡");
        System.out.println(pila);
        pila.desapilar();
        System.out.println(pila);

    }

    public void ejercicio4(){

        Cola cola = new Cola();
        cola.encolar("Hola");
        cola.encolar("mundo");
        cola.encolar("!");
        System.out.println(cola);
        cola.encolar("¡");
        System.out.println(cola);
        cola.desencolar();
        System.out.println(cola);

    }

    public void ejercicio5(){

        System.out.println("Aclaración: En la implementacion de las clases ToDoList y Tarea " +
                "se encuentran los cambios realizados pedidos por los ejercicios 10, 12 y 13. Es decir, " +
                "no estan por separado en la implementación.");
        LocalDate fechaLimite = LocalDate.now();
        //FECHA DE AYER
        LocalDate fechaAyer = LocalDate.now().minusDays(1);
        Tarea tarea1 = new Tarea("Ir al supermercado mañana.",fechaLimite);
        Tarea tarea2 = new Tarea("Consultar repuesto del auto.",fechaAyer);
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel.",fechaAyer);
        tarea2.marcarComoTerminada("Juan Fernandez",fechaAyer);
        System.out.print(tarea1);
        System.out.print(tarea2);
        System.out.print(tarea3);

    }

    public void ejercicio6(){

        Libro frankestein = new Libro("Frankestein","Mary Shelley",416,10,27,"978-987-0000");
        Libro dracula = new Libro("Dracula","Bram Stoker",512,1,12,"978-994-0012");
        Biblioteca b = new Biblioteca();
        frankestein.verDescripcion();
        dracula.verDescripcion();
        System.out.println("El libro con mayor cant. de páginas es " + mayorCantidadPaginas(dracula,frankestein));
        dracula.prestar();
        frankestein.prestar();
        b.cargar(frankestein);
        b.cargar(dracula);
        b.totalPrestamos();

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
        if(longitud >= 8){
            ArrayList<Password> coleccion = new ArrayList<>();
            Password contra1 = new Password(longitud);
            Password contra2 = new Password(longitud);
            Password contra3 = new Password(longitud);
            Password contra4 = new Password(longitud);
            Password contra5 = new Password(longitud);
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
        else{
            System.out.println("<La longitud de las contraseñas deberá de ser de al menos 8 caracteres>");
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

    public void ejercicio10(){

        System.out.println("Aclaración: En la implementacion de las clases ToDoList y Tarea " +
                "se encuentran los cambios realizados pedidos por los ejercicios 10, 12 y 13. Es decir, " +
                "no estan por separado en la implementación.");
        LocalDate fechaLimite = LocalDate.now();
        LocalDate fechaRecordatorio1 = LocalDate.now().minusMonths(3);
        LocalDate fechaRecordatorio2 = LocalDate.now().plusMonths(1);
        Tarea tarea1 = new Tarea("Lavar los platos.",fechaLimite,fechaRecordatorio1);
        Tarea tarea2 = new Tarea("Arreglar el cuarto.",fechaLimite,fechaRecordatorio2);
        System.out.println("Prioridad tarea1: " + tarea1.getPrioridad());
        System.out.println("Prioridad tarea2: " + tarea2.getPrioridad());
        System.out.print(tarea1);
        System.out.print(tarea2);

    }

    public void ejercicio11(){

        Jugador jugador1 = new Jugador("Martin");
        Jugador jugador2 = new Jugador("Martina");
        Diccionario d = new Diccionario();
        d.addPalabras("Arbol");
        d.addPalabras("Ojota");
        d.addPalabras("Xilofon");
        d.addPalabras("Yacare");
        d.addPalabras("Kiwi");
        jugador1.jugar("Kiwi",d);
        jugador2.jugar("Kwyjibo",d);
        System.out.println("El puntaje total de " + jugador1.getNombreJugador() + " es de: " + jugador1.getPuntajeTotal() + " ptos.");
        System.out.println("El puntaje total de " + jugador2.getNombreJugador() + " es de: " + jugador2.getPuntajeTotal() + " ptos.");
        System.out.println("El ganador es: " + jugador1.getGanador(jugador2).getNombreJugador() + ", con " + jugador1.getGanador(jugador2).getPuntajeTotal() + " ptos.");
        System.out.print(d);
        d.removePalabras("Yacare");
        d.replacePalabra("Arbol","Zanahoria");
        System.out.println(d);

    }

    public void ejercicio12(){

        int p = 0;
        Scanner sc = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        LocalDate fechaLimite = LocalDate.now();
        LocalDate fechaLimite2 = LocalDate.now().minusMonths(3);
        LocalDate fechaLimite3 = LocalDate.now().plusDays(10);
        LocalDate fechaR = LocalDate.now().plusDays(5);
        LocalDate fechaR2 = LocalDate.now();
        Tarea tarea1 = new Tarea("Lavar los platos.",fechaLimite);
        Tarea tarea2 = new Tarea("Arreglar el cuarto.",fechaLimite);
        Tarea tarea3 = new Tarea("Cocinar.",fechaLimite);
        Tarea tarea4 = new Tarea("Estudiar.",fechaLimite);
        Tarea tarea5 = new Tarea("Encerar.",fechaLimite);
        toDoList.addTarea(tarea1);
        toDoList.addTarea(tarea2);
        toDoList.addTarea(tarea3);
        toDoList.addTarea(tarea4);
        toDoList.addTarea(tarea5);
        toDoList.buscar("Lavar los platos.").marcarComoTerminada("Martin",LocalDate.now());
        toDoList.buscar("Estudiar.").marcarComoTerminada("Carolina",LocalDate.now());
        System.out.println("Elija que prioridad desea agregarle a la tarea <Estudiar>: ");
        System.out.println("");
        System.out.println("1. ALTA");
        System.out.println("2. MEDIA");
        System.out.println("3. BAJA");
        System.out.print("Teclee un entero entre 1 y 3: ");
        p = sc.nextInt();
        toDoList.buscar("Estudiar.").setPrioridad(p);
        Tarea tarea6 = new Tarea("Pasear.",fechaLimite3,fechaR);
        Tarea tarea7 = new Tarea("Salir a correr.",fechaLimite3,fechaR2);
        toDoList.addTarea(tarea6);
        toDoList.addTarea(tarea7);
        toDoList.getToDoList();
        for(int t = 0; t < toDoList.getLongitud(); t++){
            System.out.print(toDoList.getTarea(t));
        }

    }

    public void ejercicio13(){

        String colaborador = "Sebastian";
        ToDoList toDoList = new ToDoList();
        LocalDate fechaLimite = LocalDate.now();
        LocalDate fechaLimite2 = LocalDate.now().minusMonths(3);
        LocalDate fechaLimite3 = LocalDate.now().plusDays(10);
        Tarea tarea1 = new Tarea("Lavar los platos.",fechaLimite);
        Tarea tarea2 = new Tarea("Arreglar el cuarto.",fechaLimite);
        Tarea tarea3 = new Tarea("Cocinar.",fechaLimite);
        Tarea tarea4 = new Tarea("Estudiar.",fechaLimite);
        Tarea tarea5 = new Tarea("Encerar.",fechaLimite);
        tarea1.marcarComoTerminada("Martin",LocalDate.now());
        tarea2.marcarComoTerminada("Sebastian",LocalDate.now());
        tarea3.marcarComoTerminada("Julia",LocalDate.now());
        tarea4.marcarComoTerminada("Sebastian",LocalDate.now());
        tarea5.marcarComoTerminada("Julia",LocalDate.now());
        toDoList.addTarea(tarea1);
        toDoList.addTarea(tarea2);
        toDoList.addTarea(tarea3);
        toDoList.addTarea(tarea4);
        toDoList.addTarea(tarea5);
        toDoList.getTDLporColaborador(colaborador);

    }


}
