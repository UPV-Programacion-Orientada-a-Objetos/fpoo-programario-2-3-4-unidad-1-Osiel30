package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaSeis {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int meses = 12;
        float[] Dinero= new float[meses];
        System.out.println("A continuacion ingresa la cantidad a depositar...");

        try {
            for (int i = 0; i < meses; i++) {
                System.out.print("Ingrese la cantidad a depositar del mes "+ i+1);
                Dinero[i] = Float.parseFloat(br.readLine());
            }

            double p = Ahorro.AhorroAnual(Dinero, meses);
            System.out.println("El ahorro de los  " + meses + "meses depositados es: " + p);

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
