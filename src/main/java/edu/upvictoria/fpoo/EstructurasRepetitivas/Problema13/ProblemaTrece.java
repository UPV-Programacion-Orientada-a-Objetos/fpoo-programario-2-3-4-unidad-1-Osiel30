package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaTrece {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el monto del primer pago:");
        double PagoInicial = Double.parseDouble(reader.readLine());

        double totalPagado = Financiar.Pagos(PagoInicial);

        System.out.println("Total pagado después de 20 meses: $" + totalPagado);
    }
}