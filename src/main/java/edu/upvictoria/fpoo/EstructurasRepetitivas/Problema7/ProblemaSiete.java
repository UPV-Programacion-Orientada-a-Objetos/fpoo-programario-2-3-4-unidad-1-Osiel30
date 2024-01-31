package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaSiete {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cantidad de números (N): ");
            int n = Integer.parseInt(br.readLine());

            if (n <= 0) {
                System.out.println("La cantidad de números debe ser mayor que cero.");
                return;
            }

            double[] numeros = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el número #" + (i + 1) + ": ");
                numeros[i] = Double.parseDouble(br.readLine());
            }

            CantidadesMayorMenor.calcularCantidades(numeros);

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

