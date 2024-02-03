package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema15;

import java.io.BufferedReader;
import java.io.IOException;

public class OtroSueldoTrabajadores {
    public static double PagoTotal(int numTrabajadores, BufferedReader reader) throws IOException {
        double totalPago = 0;

        for (int i = 1; i <= numTrabajadores; i++) {
            System.out.println("Ingrese las horas trabajadas por el empleado " + i + " en cada día de la semana:");

            int horasTrabajadas = 0;
            for (int dia = 1; dia <= 6; dia++) {
                System.out.println("Día " + dia + ":");
                int horasDia = Integer.parseInt(reader.readLine());
                horasTrabajadas += horasDia;
            }

            double sueldoSemanal = horasTrabajadas * 68;

            System.out.println("El sueldo semanal del empleado " + i + " es: " + sueldoSemanal);

            totalPago += sueldoSemanal;
        }

        return totalPago;
    }
}