package edu.upvictoria.fpoo.Arreglos.Problema1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaUno {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] numeros = new double[10];

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            numeros[i] = Double.parseDouble(br.readLine());
        }
        Suma.calcularSuma(numeros);
    }
}