package ar.edu.unlu.poo;

import java.util.ArrayList;

public class Ecuacion2doGrado {

    private double a = 0, b = 0, c = 0;

    //CONSTRUCTOR
    public Ecuacion2doGrado(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
    }

    //VerEcuacion()
    public void mostrar(){
        System.out.println((int)a+"x^2 + "+(int)b+"x + "+(int)c);
    }

    //CalcularRaices()
    public ArrayList<Double> resolvente(){
        ArrayList<Double> raices = new ArrayList<>();
        double d = Math.sqrt(Math.pow(b,2)-(4*a*c));
        if(a == 0){
            System.out.println("<¡Error!: El coeficiente <a> debe ser mayor que cero.>");
        }
        else if(d < 0){
            System.out.println("<La ecuación dada no tiene raices reales.>");
            raices = null;
        }
        else{
            double r1 = (-b + d) / (2*a);
            double r2 = (-b - d) / (2*a);
            if(r1 == r2){
                raices.add(r1);
            }
            else{
                raices.add(r1);
                raices.add(r2);
            }
        }
        return raices;
    }

    //CalcularEcuacion()
    public double solucion(double x){
        return a * Math.pow(x,2) + b * x + c;
    }


}
