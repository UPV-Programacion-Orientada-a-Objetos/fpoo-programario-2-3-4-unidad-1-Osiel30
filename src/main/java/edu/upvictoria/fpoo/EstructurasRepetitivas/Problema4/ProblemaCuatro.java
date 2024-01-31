package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaCuatro {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numAlumnos = 0;

        try {
            System.out.print("Ingrese el número de alumnos: ");
            numAlumnos = Integer.parseInt(br.readLine());

            if (numAlumnos <= 0) {
                System.out.println("Número de alumnos debe ser mayor que cero.");
                return;
            }
            int[] edades = new int[numAlumnos];
            for (int i = 0; i < numAlumnos; i++) {
                System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
                edades[i] = Integer.parseInt(br.readLine());
            }

            double promedio = PromedioDeGrupo.calcularPromedio(edades, numAlumnos);

            System.out.println("La edad promedio de los " + numAlumnos + " alumnos es: " + promedio);

        } catch (IOException | NumberFormatException e) {
            System.err.println("Error de entrada/salida o formato de número inválido.");
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

