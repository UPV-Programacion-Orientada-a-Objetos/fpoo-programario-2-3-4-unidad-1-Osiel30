package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema13;
public class Financiar {
    public static double Pagos(double PagoInicial) {
        double montoPago = PagoInicial;
        double totalPagado = 0;

        for (int mes = 1; mes <= 20; mes++) {
            totalPagado += montoPago;
            montoPago *= 2;
        }
        System.out.println("Monto mensual a pagar: $" + PagoInicial);
        return totalPagado;
    }
}