package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema12;
import java.io.BufferedReader;
import java.io.IOException;

public class TikiTaka {
    public static void calcularVentas(int numVentas, BufferedReader reader) throws IOException {
        int ventasMayor1000 = 0;
        int ventasMayor500MenorIgual1000 = 0;
        int ventasMenorIgual500 = 0;

        double montoMayor1000 = 0;
        double montoMayor500MenorIgual1000 = 0;
        double montoMenorIgual500 = 0;

        for (int i = 1; i <= numVentas; i++) {
            System.out.println("Ingrese el monto de la venta " + i + ":");
            double montoVenta = Double.parseDouble(reader.readLine());

            if (montoVenta > 1000) {
                ventasMayor1000++;
                montoMayor1000 += montoVenta;
            } else if (montoVenta > 500) {
                ventasMayor500MenorIgual1000++;
                montoMayor500MenorIgual1000 += montoVenta;
            } else {
                ventasMenorIgual500++;
                montoMenorIgual500 += montoVenta;
            }
        }

        double montoTotal = montoMayor1000 + montoMayor500MenorIgual1000 + montoMenorIgual500;

        System.out.println("Cantidad de ventas mayores a $1000: " + ventasMayor1000);
        System.out.println("Monto total de ventas mayores a $1000: $" + montoMayor1000);
        System.out.println("Cantidad de ventas mayores a $500 pero menores o iguales a $1000: " + ventasMayor500MenorIgual1000);
        System.out.println("Monto total de ventas mayores a $500 pero menores o iguales a $1000: $" + montoMayor500MenorIgual1000);
        System.out.println("Cantidad de ventas menores o iguales a $500: " + ventasMenorIgual500);
        System.out.println("Monto total de ventas menores o iguales a $500: $" + montoMenorIgual500);
        System.out.println("Monto total de todas las ventas: $" + montoTotal);
    }
}