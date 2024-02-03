package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema10;
import edu.upvictoria.fpoo.EstructurasRepetitivas.Problema6.Ahorro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDiez {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int semana = 6;
        float[] Horas= new float[semana];
        System.out.println("A continuacion ingresa la cantidad a depositar...");

        try {
            for (int i = 0; i < semana; i++) {
                System.out.print("Ingrese la cantidad de horas trabajadas el dia "+ (i+1));
                Horas[i] = Float.parseFloat(br.readLine());
            }
            double Dinero = Paga.PagaSemanal(Horas);
            System.out.printf("El pago por los dias trabajados es: "+ "%.3f", Dinero);

        } catch (IOException | NumberFormatException e) {
            System.err.println("Error de entrada/salida o formato de número inválido.");
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
