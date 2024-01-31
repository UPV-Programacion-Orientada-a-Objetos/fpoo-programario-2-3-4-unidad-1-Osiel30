package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCinco {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numPersonas = 0;

        try {
            System.out.print("Ingrese el número de Personas: ");
            numPersonas = Integer.parseInt(br.readLine());

            if (numPersonas <= 0) {
                System.out.println("El numero de personas es menor a 1");
                return;
            }
            float[] Altura = new float[numPersonas];
            for (int i = 0; i < numPersonas; i++) {
                System.out.print("Ingrese la altura del Persona " + (i + 1) + ": ");
                Altura[i] = Float.parseFloat(br.readLine());
            }

            double promedio = Estatura.calcularEstatura(Altura, numPersonas);

            System.out.println("La edad promedio de los " + numPersonas + " alumnos es: " + promedio);

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
