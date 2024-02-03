package edu.upvictoria.fpoo.Arreglos.Problema3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaTres {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("¿De qué tamaño quiere los arreglos?");
        int tamanoArreglo = Integer.parseInt(br.readLine());

        String[] nombres = new String[tamanoArreglo];
        double[] promedios = new double[tamanoArreglo];

        System.out.println("Ingrese los nombres y promedios de los estudiantes:");
        ingresarDatosEstudiantes(nombres, promedios, br);
        Ordenar.ordenarPorPromedio(nombres, promedios);

        System.out.println("El ranking de promedios quedaría como:");
        for (int i = 0; i < tamanoArreglo; i++) {
            System.out.println(nombres[i] + " - Calificación: " + promedios[i]);
        }

        br.close();
    }

    private static void ingresarDatosEstudiantes(String[] nombres, double[] promedios, BufferedReader br) throws IOException {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            nombres[i] = br.readLine();

            System.out.println("Ingrese el promedio de " + nombres[i] + ":");
            promedios[i] = Double.parseDouble(br.readLine());
        }
    }
}
