package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaOnce {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el kilómetro de la primera persona:");
        int kmPersona1 = Integer.parseInt(reader.readLine());

        System.out.println("Ingrese el kilómetro de la segunda persona:");
        int kmPersona2 = Integer.parseInt(reader.readLine());

        int puntoEncuentro = Carretera.Encuentro(kmPersona1, kmPersona2);

        if (puntoEncuentro == -1) {
            System.out.println("Las personas no se encontrarán en la carretera.");
        } else {
            System.out.println("Las personas se encontrarán en el kilómetro " + puntoEncuentro);
        }
    }
}