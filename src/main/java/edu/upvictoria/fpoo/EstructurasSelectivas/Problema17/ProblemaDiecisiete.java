package edu.upvictoria.fpoo.EstructurasSelectivas.Problema17;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDiecisiete {
    public static void Regalo() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el presupuesto disponible: ");
        double presupuesto = Double.parseDouble(reader.readLine());
        String regalo;
        if (presupuesto <= 10.00) {
            regalo = "Tarjeta";
        } else if (presupuesto <= 100.00) {
            regalo = "Chocolates";
        } else if (presupuesto <= 250.00) {
            regalo = "Flores";
        } else {
            regalo = "Anillo";
        }

        System.out.println("Se puede comprar un(a) " + regalo + " para ese ser especial.");
    }
}