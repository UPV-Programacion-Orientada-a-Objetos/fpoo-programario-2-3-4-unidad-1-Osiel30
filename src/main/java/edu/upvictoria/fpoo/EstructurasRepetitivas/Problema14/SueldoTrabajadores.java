package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema14;
import java.io.BufferedReader;
import java.io.IOException;

public class SueldoTrabajadores {
    public static double calcularPagoTotal(int numTrabajadores, BufferedReader reader) throws IOException {
        double totalPago = 0;

        for (int i = 1; i <= numTrabajadores; i++) {
            System.out.println("Ingrese las horas trabajadas por el empleado " + i + " en la semana:");
            int horasTrabajadas = Integer.parseInt(reader.readLine());

            double sueldoSemanal = horasTrabajadas * 68;

            System.out.println("El sueldo semanal del empleado " + i + " es: " + sueldoSemanal);

            totalPago += sueldoSemanal;
        }

        return totalPago;
    }
}
