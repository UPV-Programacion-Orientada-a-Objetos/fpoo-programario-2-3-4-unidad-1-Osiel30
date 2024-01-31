package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema4;

public class PromedioDeGrupo {
    public static double calcularPromedio(int[] edades, int numAlumnos) {
        int sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }
        return (double) sumaEdades / numAlumnos;
    }
}
