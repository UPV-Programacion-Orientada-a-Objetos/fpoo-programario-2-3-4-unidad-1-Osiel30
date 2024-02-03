package edu.upvictoria.fpoo.EstructurasSelectivas.Problema5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCinco {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el primer valor: ");
        int valor1 = Integer.parseInt(reader.readLine());

        System.out.println("Ingrese el segundo valor: ");
        int valor2 = Integer.parseInt(reader.readLine());

        System.out.println("Ingrese el tercer valor: ");
        int valor3 = Integer.parseInt(reader.readLine());

        int mayor = valor1;

        if (valor2 > mayor) {
            mayor = valor2;
        }
        if (valor3 > mayor) {
            mayor = valor3;
        }

        System.out.println("El mayor valor es: " + mayor);
    }
}