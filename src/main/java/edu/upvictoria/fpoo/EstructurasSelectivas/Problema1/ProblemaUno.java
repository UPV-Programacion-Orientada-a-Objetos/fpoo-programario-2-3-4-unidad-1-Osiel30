package edu.upvictoria.fpoo.EstructurasSelectivas.Problema1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaUno {
    public static void numeros() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el primer valor: ");
        int valor1 = Integer.parseInt(reader.readLine());

        System.out.println("Ingrese el segundo valor: ");
        int valor2 = Integer.parseInt(reader.readLine());

        if (valor1 > valor2) {
            System.out.println("El primer valor es mayor.");
        } else if (valor2 > valor1) {
            System.out.println("El segundo valor es mayor.");
        } else {
            System.out.println("Ambos valores son iguales.");
        }
    }
}