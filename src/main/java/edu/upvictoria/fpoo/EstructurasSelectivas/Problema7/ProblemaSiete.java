package edu.upvictoria.fpoo.EstructurasSelectivas.Problema7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaSiete {
    public static void Uvas() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el tipo de uva (A o B): ");
        String tipoUva = reader.readLine();

        System.out.println("Ingrese el tamaño de uva (1 o 2): ");
        int tamanoUva = Integer.parseInt(reader.readLine());

        double precioInicial = 0.0;

        if (tipoUva.equals("A")) {
            precioInicial = 100.00;
            if (tamanoUva == 1) {
                precioInicial += 20.00;
            } else if (tamanoUva == 2) {
                precioInicial += 30.00;
            }
        } else if (tipoUva.equals("B")) {
            precioInicial = 80.00;
            if (tamanoUva == 1) {
                precioInicial -= 30.00;
            } else if (tamanoUva == 2) {
                precioInicial -= 50.00;
            }
        }

        System.out.println("La ganancia por la venta de uvas es: " + precioInicial);
    }
}
