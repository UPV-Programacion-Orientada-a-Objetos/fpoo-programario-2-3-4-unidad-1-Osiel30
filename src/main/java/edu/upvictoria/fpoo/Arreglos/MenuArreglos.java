package edu.upvictoria.fpoo.Arreglos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuArreglos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Menú de Programas");
            System.out.println("1. Ejercicio Uno");
            System.out.println("2. Ejercicio Dos");
            System.out.println("3. Ejercicio Tres");
            System.out.println("4. Ejercicio Cuatro");
            System.out.println("5. Ejercicio Cinco");
            System.out.println("0. Salir");
            System.out.print("Seleccione un programa (0-5): ");

            int opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    edu.upvictoria.fpoo.Arreglos.Problema1.ProblemaUno.main(args);
                    break;
                case 2:
                    edu.upvictoria.fpoo.Arreglos.Problema2.ProblemaDos.main(args);
                    break;
                case 3:
                    edu.upvictoria.fpoo.Arreglos.Problema3.ProblemaTres.main(args);
                    break;
                case 4:
                    edu.upvictoria.fpoo.Arreglos.Problema4.ProblemaCuatro.main(args);
                    break;
                case 5:
                    edu.upvictoria.fpoo.Arreglos.Problema5.ProblemaCinco.main(args);
                    break;
                case 0:
                    System.out.println("Saliendo del programa....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
