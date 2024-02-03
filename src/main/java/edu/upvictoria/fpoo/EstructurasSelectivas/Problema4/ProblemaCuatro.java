package edu.upvictoria.fpoo.EstructurasSelectivas.Problema4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCuatro {
    public static void Traje() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el precio del traje: ");
        double precio = Double.parseDouble(reader.readLine());
        double descuento;
        if (precio > 2500.00) {
            descuento = precio * 0.15;
        } else {
            descuento = precio * 0.08;
        }
        double precioFinal = precio - descuento;
        System.out.println("El precio final a pagar es: $" + precioFinal);
        System.out.println("El descuento aplicado es: $" + descuento);
    }
}
