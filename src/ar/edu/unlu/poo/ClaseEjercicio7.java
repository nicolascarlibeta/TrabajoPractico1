package ar.edu.unlu.poo;

public class ClaseEjercicio7 {

    public void mostrarEjemplo(){

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


}
