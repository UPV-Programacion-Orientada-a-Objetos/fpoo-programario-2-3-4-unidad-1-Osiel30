package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCatorce {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el número de trabajadores:");
        int numTrabajadores = Integer.parseInt(reader.readLine());

        double totalPago = SueldoTrabajadores.calcularPagoTotal(numTrabajadores, reader);

        System.out.println("La empresa pagó un total de $" + totalPago + " a los " + numTrabajadores + " empleados.");
    }
}