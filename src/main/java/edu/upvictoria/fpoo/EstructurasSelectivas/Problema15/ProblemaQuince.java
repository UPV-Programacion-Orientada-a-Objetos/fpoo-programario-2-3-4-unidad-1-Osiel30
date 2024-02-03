package edu.upvictoria.fpoo.EstructurasSelectivas.Problema15;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaQuince {
    public static void Quince() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la edad de la persona: ");
        int edad = Integer.parseInt(reader.readLine());
        if (edad >= 18) {
            System.out.println("La persona puede votar en las próximas elecciones.");
        } else {
            System.out.println("La persona no puede votar en las próximas elecciones.");
        }
    }
}