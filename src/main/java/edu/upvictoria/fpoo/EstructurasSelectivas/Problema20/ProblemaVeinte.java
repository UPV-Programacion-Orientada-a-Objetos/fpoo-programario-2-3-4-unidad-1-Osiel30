package edu.upvictoria.fpoo.EstructurasSelectivas.Problema20;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaVeinte {
    public static void Articulos() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese el precio del artículo: ");
            double precio = Double.parseDouble(reader.readLine());
            double descuento = 0;
            if (precio >= 200) {
                descuento = 0.15;
            } else if (precio > 100 && precio < 200) {
                descuento = 0.12;
            } else if (precio <= 100) {
                descuento = 0.10;
            }
            double costoFinal = precio - (precio * descuento);
            System.out.println("El costo del artículo es: $" + costoFinal);
            System.out.println("El descuento aplicado es: " + (descuento * 100) + "%");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}