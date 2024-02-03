package edu.upvictoria.fpoo.Arreglos.Problema5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaCinco {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese los elementos del vector:");
        int[] vector = new int[6];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = Integer.parseInt(br.readLine());
        }
        Intercambio.realizarIntercambio(vector);

        br.close();
    }
}
