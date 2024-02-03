package edu.upvictoria.fpoo.EstructurasSelectivas.Problema16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaDieciseis {
    public static void Pago() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese las horas trabajadas: ");
        int horasTrabajadas = Integer.parseInt(reader.readLine());
        System.out.println("Ingrese el pago por hora: ");
        double pagoHora = Double.parseDouble(reader.readLine());
        double sueldoSemanal;
        if (horasTrabajadas > 40) {
            int horasExtra = horasTrabajadas - 40;
            sueldoSemanal = (40 * pagoHora) + (horasExtra * (pagoHora * 2));
        } else {
            sueldoSemanal = horasTrabajadas * pagoHora;
        }
        System.out.println("El sueldo semanal del trabajador es: $" + sueldoSemanal);
    }
}