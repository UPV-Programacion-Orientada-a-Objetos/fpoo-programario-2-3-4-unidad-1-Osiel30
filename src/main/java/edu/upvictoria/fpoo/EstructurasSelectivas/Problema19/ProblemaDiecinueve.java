package edu.upvictoria.fpoo.EstructurasSelectivas.Problema19;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDiecinueve {
    public static void EdadMayorMenor() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el nombre de la primera persona: ");
            String nombre1 = reader.readLine();

            System.out.println("Ingrese el año de nacimiento de la primera persona: ");
            int fecha1 = Integer.parseInt(reader.readLine());

            System.out.println("Ingrese el nombre de la segunda persona: ");
            String nombre2 = reader.readLine();

            System.out.println("Ingrese el año de nacimiento de la segunda persona: ");
            int fecha2 = Integer.parseInt(reader.readLine());

            System.out.println("Ingrese el nombre de la tercera persona: ");
            String nombre3 = reader.readLine();

            System.out.println("Ingrese el año de nacimiento de la tercera persona: ");
            int fecha3 = Integer.parseInt(reader.readLine());

            int edad1 = calcularEdad(fecha1);
            int edad2 = calcularEdad(fecha2);
            int edad3 = calcularEdad(fecha3);

            String personaMayor, personaMenor;

            if (edad1 > edad2 && edad1 > edad3) {
                personaMayor = nombre1;
            } else if (edad2 > edad1 && edad2 > edad3) {
                personaMayor = nombre2;
            } else {
                personaMayor = nombre3;
            }

            if (edad1 < edad2 && edad1 < edad3) {
                personaMenor = nombre1;
            } else if (edad2 < edad1 && edad2 < edad3) {
                personaMenor = nombre2;
            } else {
                personaMenor = nombre3;
            }

            System.out.println("La persona de mayor edad es: " + personaMayor);
            System.out.println("La persona de menor edad es: " + personaMenor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int calcularEdad(int fechaNacimiento) {
        return 2023 - fechaNacimiento;
    }
}