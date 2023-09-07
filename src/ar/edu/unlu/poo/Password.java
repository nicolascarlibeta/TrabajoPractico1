package ar.edu.unlu.poo;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Password {
    /*  //ESTRUCTURA

        Contraseña (Como String y como Array)
        Estado
        Longitud

        //COMPORTAMIENTO

        generarPassword()
        estadoPassword()
        //Getters y Setters (COMUNICACIÓN CON OTRAS CLASES)
        getPassword()
        getLongitud()

        */
    private enum Estado{FUERTE, DEBIL};
    private ArrayList<Character> password = new ArrayList<>();
    private String passwordString = "";
    private int longitud = 8;

    //CONSTRUCTOR
    public Password(){
        generarPassword();
    }

    public Password(int longitud){
        generarPassword(longitud);
    }

    public void generarPassword(){
        Random rnd = new Random();
        int caracter = 0;
        boolean caracterCorrecto;
        for (int i = 0; i < longitud; i++){
            caracterCorrecto = false;
            while (!caracterCorrecto) {
                caracter = rnd.nextInt(123 - 48) + 48;
                if ((caracter >= 48 && caracter <= 57) || (caracter >= 65 && caracter <= 90) ||
                        (caracter >= 97 && caracter <= 122)) {
                    password.add((char)caracter);
                    passwordString += (char)caracter;
                    caracterCorrecto = true;
                }
            }
        }
    }

    public void generarPassword(int longitud){
        if(longitud >= 8){
            this.longitud = longitud;
            Random rnd = new Random();
            int caracter = 0;
            boolean caracterCorrecto;
            for (int i = 0; i < longitud; i++){
                caracterCorrecto = false;
                while (!caracterCorrecto) {
                    caracter = rnd.nextInt(123 - 48) + 48;
                    if ((caracter >= 48 && caracter <= 57) || (caracter >= 65 && caracter <= 90) ||
                            (caracter >= 97 && caracter <= 122)) {
                        password.add((char)caracter);
                        passwordString += (char)caracter;
                        caracterCorrecto = true;
                    }
                }
            }
        }
        else{
            System.out.println("<Error! Ingrese una longitud mayor o igual que (8).>");
        }
    }

    public Estado estadoPassword(){
        int mayus = 0, minus = 0, num = 0, caracter = 0;
        Estado e = Estado.DEBIL;
        for(int i = 0; i < longitud; i++){
            caracter = password.get(i);
            if(caracter >= 48 && caracter <= 57){
                num += 1;
            }
            else if(caracter >= 65 && caracter <= 90){
                mayus += 1;
            }
            else{
                minus += 1;
            }
        }

        if(mayus > 2 && minus > 1 && num >= 2){
            e = Estado.FUERTE;
        }

        return e;

    }

    //Getters y Setters
    public String getPassword(){
        return passwordString;
    }

    public int getLongitud(){
        return longitud;
    }

}
