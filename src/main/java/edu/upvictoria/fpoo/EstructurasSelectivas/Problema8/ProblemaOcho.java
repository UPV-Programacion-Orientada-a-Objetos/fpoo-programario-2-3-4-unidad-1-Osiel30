package edu.upvictoria.fpoo.EstructurasSelectivas.Problema8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaOcho {
    public static void Autobuses() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el número de alumnos: ");
        int numeroAlumnos = Integer.parseInt(reader.readLine());

        double costoPorAlumno;
        double costoTotal;

        if (numeroAlumnos >= 100) {
            costoPorAlumno = 65.00;
            costoTotal = numeroAlumnos * costoPorAlumno;
        } else if (numeroAlumnos >= 50) {
            costoPorAlumno = 70.00;
            costoTotal = numeroAlumnos * costoPorAlumno;
        } else if (numeroAlumnos >= 30) {
            costoPorAlumno = 95.00;
            costoTotal = numeroAlumnos * costoPorAlumno;
        } else {
            costoPorAlumno = 0.0;
            costoTotal = 4000.00;
        }
        System.out.println("El pago a la compañía de autobuses es: $" + costoTotal);
        System.out.println("El costo por alumno es: $" + costoPorAlumno);
    }
}