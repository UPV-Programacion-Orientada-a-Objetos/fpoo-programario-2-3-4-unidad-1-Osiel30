package edu.upvictoria.fpoo.Arreglos.Problema2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("¿De qué tamaño quiere los arreglos?");
        int tamanoArreglo = Integer.parseInt(br.readLine());

        float[] arregloA = new float[tamanoArreglo];
        float[] arregloB = new float[tamanoArreglo];

        System.out.println("Ingrese los elementos del primer arreglo (A):");
        ingresarElementos(arregloA, br);

        System.out.println("Ingrese los elementos del segundo arreglo (B):");
        ingresarElementos(arregloB, br);

        Suma.sumarArreglos(arregloA, arregloB);

        br.close();
    }

    private static void ingresarElementos(float[] arreglo, BufferedReader br) throws IOException {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            arreglo[i] = Float.parseFloat(br.readLine());
        }
    }
}