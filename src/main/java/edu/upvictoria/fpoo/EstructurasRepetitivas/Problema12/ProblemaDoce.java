package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema12;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDoce {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el número de ventas:");
        int numVentas = Integer.parseInt(reader.readLine());

        TikiTaka.calcularVentas(numVentas, reader);
    }
}
