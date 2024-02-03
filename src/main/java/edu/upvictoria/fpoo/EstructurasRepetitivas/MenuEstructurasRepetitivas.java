package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuEstructurasRepetitivas {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            mostrarMenu();
            try {
                int opcion = Integer.parseInt(reader.readLine());
                switch (opcion) {
                    case 1:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema1.ProblemaUno.main(args);
                        break;
                    case 2:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema2.ProblemaDos.main(args);
                        break;
                    case 3:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema3.ProblemaTres.main(args);
                        break;
                    case 4:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema4.ProblemaCuatro.main(args);
                        break;
                    case 5:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema5.ProblemaCinco.main(args);
                        break;
                    case 6:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema6.ProblemaSeis.main(args);
                        break;
                    case 7:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema7.ProblemaSiete.main(args);
                        break;
                    case 8:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema8.ProblemaOcho.main(args);
                        break;
                    case 9:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema9.ProblemaNueve.main(args);
                        break;
                    case 10:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema10.ProblemaDiez.main(args);
                        break;
                    case 11:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema11.ProblemaOnce.main(args);
                        break;
                    case 12:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema12.ProblemaDoce.main(args);
                        break;
                    case 13:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema13.ProblemaTrece.main(args);
                        break;
                    case 14:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema14.ProblemaCatorce.main(args);
                        break;
                    case 15:
                        edu.upvictoria.fpoo.EstructurasRepetitivas.Problema15.ProblemaQuince.main(args);
                        break;
                    case 0:
                        System.out.println("Saliendo del programa....");
                        return;
                    default:
                        System.out.println("Opción no válida, Por favor, ingrese un número del 0 al 20.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
        private static void mostrarMenu() {
            System.out.println("=== Menú de Estructuras Selectivas ===");
            System.out.println("1. EjercicioUno");
            System.out.println("2. EjercicioDos");
            System.out.println("3. EjercicioTres");
            System.out.println("4. EjercicioCuatro");
            System.out.println("5. EjercicioCinco");
            System.out.println("6. EjercicioSeis");
            System.out.println("7. EjercicioSiete");
            System.out.println("8. EjercicioOcho");
            System.out.println("9. EjercicioNueve");
            System.out.println("10. EjercicioDiez");
            System.out.println("11. EjercicioOnce");
            System.out.println("12. EjercicioDoce");
            System.out.println("13. EjercicioTrece");
            System.out.println("14. EjercicioCatorce");
            System.out.println("15. EjercicioQuince");
            System.out.println("0. Salir");
            System.out.println("=====================================");
            System.out.println("Ingrese el número de ejercicio que desea ejecutar (0 para salir): ");
        }
}
