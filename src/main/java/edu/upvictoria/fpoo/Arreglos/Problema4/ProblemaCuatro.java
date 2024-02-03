package edu.upvictoria.fpoo.Arreglos.Problema4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCuatro {
    public static void main(String[] args) throws IOException {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = new int[10];

        System.out.println("Ingrese los elementos del arreglo B:");
        ingresarElementos(B);
        Productos.run(A, B);
    }

    private static void ingresarElementos(int[] arreglo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            arreglo[i] = Integer.parseInt(br.readLine());
        }

        br.close();
    }
}