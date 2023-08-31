package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.util.Random;

public class ClaseMain {
    //Clase <MAIN>
    public static void main(String[] args) {
/*
        //Ejercicio 5: Lista de Tareas
        ListaDeTareas taskList = new ListaDeTareas();
        //Fecha de hoy
        LocalDate fechaLimite = LocalDate.now();
        //Fecha de ayer
        LocalDate fechaAyer = LocalDate.now().minusDays(1);
        taskList.nuevaTarea("Ir al supermercado mañana",fechaLimite);
        taskList.nuevaTarea("Consultar repuesto del auto",fechaAyer);
        taskList.nuevaTarea("Ir al cine a ver la nueva película de Marvel",fechaAyer);
        taskList.tareaTerminada(2);
        taskList.mostrar();

        //Ejercicio 6
        Biblioteca biblio = new Biblioteca();
        Libro dracula = new Libro("Dracula","Bram Stoker",416,10,12);
        Libro frankestein = new Libro("Frankestein","Mary Shelley",518,1,12);

        biblio.cargar(dracula);
        biblio.cargar(frankestein);
        biblio.ver();
        ClaseEjercicio6 ejer6 = new ClaseEjercicio6();
        System.out.println("El libro con mayor cant. de páginas es: " + ejer6.mayorCantidadPaginas(dracula,frankestein));
        biblio.prestar("Dracula");
        biblio.prestar("Frankestein");
        biblio.ver();
        biblio.totalPrestamos();

       //Ejercicio 7
        ClaseEjercicio7 ejercicio7 = new ClaseEjercicio7();
        ejercicio7.mostrarEjemplo();
    */
        String password = "";
        Random rnd = new Random();
        int caracter = 0;
        boolean caracterCorrecto;
        //Password: 4jJk2x1Oo
        for (int i = 0; i < 8; i++) {
            caracterCorrecto = false;
            while (!caracterCorrecto) {
                caracter = rnd.nextInt(123 - 48) + 48;
                if ((caracter >= 48 && caracter <= 57) || (caracter >= 65 && caracter <= 90) ||
                        (caracter >= 97 && caracter <= 122)) {
                    password += (char) caracter;
                    caracterCorrecto = true;
                }
            }
        }

        System.out.println(password);
    }
}
