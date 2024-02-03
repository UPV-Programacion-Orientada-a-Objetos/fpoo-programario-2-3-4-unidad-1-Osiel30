package edu.upvictoria.fpoo.EstructurasSelectivas.Problema10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaDiez {
    public static void KmAutobus() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el tipo de autobús (A, B, C): ");
        String tipoAutobus = reader.readLine();

        System.out.println("Ingrese el número de kilómetros recorridos: ");
        int kilometrosRecorridos = Integer.parseInt(reader.readLine());

        System.out.println("Ingrese el número de personas: ");
        int numeroPersonas = Integer.parseInt(reader.readLine());

        double costoPorKilometro;

        if (tipoAutobus.equals("A")) {
            costoPorKilometro = 2.0;
        } else if (tipoAutobus.equals("B")) {
            costoPorKilometro = 2.5;
        } else {
            costoPorKilometro = 3.0;
        }

        double costoTotal;

        if (numeroPersonas >= 20) {
            costoTotal = kilometrosRecorridos * costoPorKilometro * numeroPersonas;
        } else {
            costoTotal = kilometrosRecorridos * costoPorKilometro * 20; // Cobro mínimo de 20 personas
        }

        double costoPorPersona = costoTotal / numeroPersonas;

        System.out.println("El costo total del viaje es: $" + costoTotal);
        System.out.println("El costo por persona es: $" + costoPorPersona);
    }
}