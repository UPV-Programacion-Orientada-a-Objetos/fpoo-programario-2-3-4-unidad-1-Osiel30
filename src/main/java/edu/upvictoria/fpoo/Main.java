package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.Arreglos.MenuArreglos;
import edu.upvictoria.fpoo.EstructurasSelectivas.MenuEstructurasSelectivas;
import edu.upvictoria.fpoo.EstructurasRepetitivas.MenuEstructurasRepetitivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Menú Principal");
            System.out.println("1. Arreglos");
            System.out.println("2. Estructuras Selectivas");
            System.out.println("3. Estructuras Repetitivas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción (0-2): ");
            int opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    MenuArreglos.main(args);
                    break;
                case 2:
                    MenuEstructurasSelectivas.main(args);
                    break;
                case 3:
                    MenuEstructurasRepetitivas.main(args);
                case 0:
                    System.out.println("Saliendo del programa....");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}