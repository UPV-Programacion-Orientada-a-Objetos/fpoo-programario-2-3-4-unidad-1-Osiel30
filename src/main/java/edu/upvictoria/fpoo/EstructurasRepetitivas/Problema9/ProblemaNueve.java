package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaNueve {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cantidad de elementos de la sucesión de Fibonacci (N): ");
            int n = Integer.parseInt(br.readLine());

            if (n <= 0) {
                System.out.println("Por favor, ingrese un número entero positivo para N.");
                return;
            }

            Fibonacci.imprimirFibonacci(n);

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
