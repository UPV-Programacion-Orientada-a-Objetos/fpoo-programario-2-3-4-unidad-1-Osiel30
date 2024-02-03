package edu.upvictoria.fpoo.EstructurasSelectivas.Problema12;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDoce {
    public static void  Cita() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el número de cita: ");
        int numeroCita = Integer.parseInt(reader.readLine());

        double costoCita;
        double gastoTratamiento;

        if (numeroCita <= 3) {
            costoCita = 200.00;
        } else if (numeroCita <= 5) {
            costoCita = 150.00;
        } else if (numeroCita <= 8) {
            costoCita = 100.00;
        } else {
            costoCita = 50.00;
        }
        gastoTratamiento = (3 * 200.00) + (2 * 150.00) + (3 * 100.00) + ((numeroCita - 8) * 50.00);
        System.out.println("El costo de la cita es: $" + costoCita);
        System.out.println("El gasto total en el tratamiento es: $" + gastoTratamiento);
    }
}