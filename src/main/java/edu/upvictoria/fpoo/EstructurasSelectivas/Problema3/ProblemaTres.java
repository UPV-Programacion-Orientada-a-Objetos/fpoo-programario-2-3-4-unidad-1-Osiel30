package edu.upvictoria.fpoo.EstructurasSelectivas.Problema3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaTres {
    public static void Lapices() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese la cantidad de lápices: ");
        int cantidad = Integer.parseInt(reader.readLine());

        double costo;

        if (cantidad >= 1000) {
            costo = cantidad * 3.65;
        } else {
            costo = cantidad * 4.83;
        }

        System.out.println("El costo total es: $" + costo);
    }
}
