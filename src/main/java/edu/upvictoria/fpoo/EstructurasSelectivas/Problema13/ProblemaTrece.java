package edu.upvictoria.fpoo.EstructurasSelectivas.Problema13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaTrece {
    public static void Sistema() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese la clave del artículo (1, 2, 3, 4, 5 o 6): ");
        int claveArticulo = Integer.parseInt(reader.readLine());

        System.out.println("Ingrese el costo de la materia prima: ");
        double costoMateriaPrima = Double.parseDouble(reader.readLine());

        double costoProduccion = costoMateriaPrima;

        double costoManoObra=0.0;
        double costoGastosFabricacion=0.0;

        if (claveArticulo == 3 || claveArticulo == 4) {
            costoManoObra = 0.75 * costoMateriaPrima;
        } else if (claveArticulo == 1 || claveArticulo == 5) {
            costoManoObra = 0.80 * costoMateriaPrima;
        } else {
            costoManoObra = 0.85 * costoMateriaPrima;
        }

        if (claveArticulo == 2 || claveArticulo == 5) {
            costoGastosFabricacion = 0.30 * costoMateriaPrima;
        } else if (claveArticulo == 3 || claveArticulo == 6) {
            costoGastosFabricacion = 0.35 * costoMateriaPrima;
        } else {
            costoGastosFabricacion = 0.28 * costoMateriaPrima;
        }

        double precioVenta = costoProduccion + (0.45 * costoProduccion);

        System.out.println("El precio de venta del artículo es: $" + precioVenta);
    }
}
