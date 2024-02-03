package edu.upvictoria.fpoo.EstructurasSelectivas.Problema14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCatorce {
    public static void Tarjeta() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el tipo de tarjeta (1, 2, 3, u otro): ");
        int tipoTarjeta = Integer.parseInt(reader.readLine());
        double aumentoLimite;
        if (tipoTarjeta == 1) {
            aumentoLimite = 0.25;
        } else if (tipoTarjeta == 2) {
            aumentoLimite = 0.35;
        } else if (tipoTarjeta == 3) {
            aumentoLimite = 0.40;
        } else {
            aumentoLimite = 0.50;
        }
        System.out.println("El aumento del límite de crédito es del " + (aumentoLimite * 100) + "%");
    }
}