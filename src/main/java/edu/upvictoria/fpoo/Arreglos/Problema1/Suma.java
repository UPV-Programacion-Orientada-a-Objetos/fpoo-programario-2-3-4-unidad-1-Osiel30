package edu.upvictoria.fpoo.Arreglos.Problema1;
public class Suma {
    public static void calcularSuma(double[] numeros) {
        double suma = 0;

        for (double numero : numeros) {
            suma += numero;
        }

        System.out.println("La suma es: " + suma);
    }
}