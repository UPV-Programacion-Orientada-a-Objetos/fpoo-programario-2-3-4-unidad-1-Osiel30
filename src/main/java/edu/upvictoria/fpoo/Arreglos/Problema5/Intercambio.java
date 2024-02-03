package edu.upvictoria.fpoo.Arreglos.Problema5;
public class Intercambio {
    public static void realizarIntercambio(int[] vector) {
        System.out.println("Vector Intercambiado:");

        for (int i = 0; i < vector.length / 2; i++) {
            int temp = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = temp;
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }
    }
}