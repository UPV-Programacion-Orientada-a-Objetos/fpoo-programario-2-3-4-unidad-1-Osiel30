package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema9;

public class Fibonacci {
    public static void imprimirFibonacci(int n) {
        int primerElemento = 0;
        int segundoElemento = 1;

        System.out.println("Los primeros " + n + " elementos de la sucesión de Fibonacci son:");

        System.out.print(primerElemento + " " + segundoElemento + " ");

        for (int i = 2; i < n; i++) {
            int siguienteElemento = primerElemento + segundoElemento;
            System.out.print(siguienteElemento + " ");

            primerElemento = segundoElemento;
            segundoElemento = siguienteElemento;
        }
    }
}
