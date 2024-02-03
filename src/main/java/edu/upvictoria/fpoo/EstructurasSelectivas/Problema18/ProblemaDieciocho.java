package edu.upvictoria.fpoo.EstructurasSelectivas.Problema18;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDieciocho {
    public static void HorasdeEstacionamiento() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la cantidad de horas de estacionamiento: ");
        int horas = Integer.parseInt(reader.readLine());
        double costo;
        if (horas <= 2) {
            costo = horas * 5.00;
        } else if (horas <= 5) {
            costo = 2 * 5.00 + (horas - 2) * 4.00;
        } else if (horas <= 10) {
            costo = 2 * 5.00 + 3 * 4.00 + (horas - 5) * 3.00;
        } else {
            costo = 2 * 5.00 + 3 * 4.00 + 5 * 3.00 + (horas - 10) * 2.00;
        }
        System.out.println("El costo del estacionamiento es: $" + costo);
    }
}
