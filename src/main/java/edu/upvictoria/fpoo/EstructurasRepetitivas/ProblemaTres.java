package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ProblemaTres {
        public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            float[] valores = new float[10];
            int i = 0;

            try {
                do {
                    System.out.print("Ingrese el valor " + (i + 1) + ": ");
                    float valor = Float.parseFloat(br.readLine());
                    valores[i] = valor;
                    i++;
                } while (i < 10);

                float resultado = SumaConCicloDoWhile.Sumar(valores);
                System.out.println("La suma de los valores es: " + resultado);

            } catch (IOException | NumberFormatException e) {
                System.err.println("Error de entrada/salida o formato de número inválido.");
                e.printStackTrace();
            }
        }

}
