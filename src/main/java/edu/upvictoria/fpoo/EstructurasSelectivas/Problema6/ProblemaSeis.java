package edu.upvictoria.fpoo.EstructurasSelectivas.Problema6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaSeis {
    public static void Presupuesto() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el número de personas: ");
        int numeroPersonas = Integer.parseInt(reader.readLine());

        double costoPorPersona;

        if (numeroPersonas > 300) {
            costoPorPersona = 75.00;
        } else if (numeroPersonas > 200) {
            costoPorPersona = 85.00;
        } else {
            costoPorPersona = 95.00;
        }

        double presupuesto = numeroPersonas * costoPorPersona;

        System.out.println("El presupuesto para el evento es: $" + presupuesto);
    }
}