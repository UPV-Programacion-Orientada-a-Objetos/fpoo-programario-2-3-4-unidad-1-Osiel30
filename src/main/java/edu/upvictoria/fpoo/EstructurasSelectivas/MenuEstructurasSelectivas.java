package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuEstructurasSelectivas {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            mostrarMenu();
            try {
                int opcion = Integer.parseInt(reader.readLine());
                switch (opcion) {
                    case 1:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema1.ProblemaUno.numeros();
                        break;
                    case 2:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema2.ProblemaDos.numeros();
                        break;
                    case 3:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema3.ProblemaTres.Lapices();
                        break;
                    case 4:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema4.ProblemaCuatro.Traje();
                        break;
                    case 5:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema5.ProblemaCinco.run();
                        break;
                    case 6:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema6.ProblemaSeis.Presupuesto();
                        break;
                    case 7:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema7.ProblemaSiete.Uvas();
                        break;
                    case 8:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema8.ProblemaOcho.Autobuses();
                        break;
                    case 9:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema9.ProblemaNueve.Llamada();
                        break;
                    case 10:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema10.ProblemaDiez.KmAutobus();
                        break;
                    case 11:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema11.ProblemaOnce.ElecciondeHamburguesa();
                        break;
                    case 12:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema12.ProblemaDoce.Cita();
                        break;
                    case 13:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema13.ProblemaTrece.Sistema();
                        break;
                    case 14:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema14.ProblemaCatorce.Tarjeta();
                        break;
                    case 15:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema15.ProblemaQuince.Quince();
                        break;
                    case 16:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema16.ProblemaDieciseis.Pago();
                        break;
                    case 17:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema17.ProblemaDiecisiete.Regalo();
                        break;
                    case 18:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema18.ProblemaDieciocho.HorasdeEstacionamiento();
                        break;
                    case 19:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema19.ProblemaDiecinueve.EdadMayorMenor();
                        break;
                    case 20:
                        edu.upvictoria.fpoo.EstructurasSelectivas.Problema20.ProblemaVeinte.Articulos();
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
            System.out.println("16. EjercicioDiesciseis");
            System.out.println("17. EjercicioDiescisiete");
            System.out.println("18. EjercicioDiesciocho");
            System.out.println("19. EjercicioDiescinueve");
            System.out.println("20. EjercicioVeinte");
            System.out.println("0. Salir");
            System.out.println("=====================================");
            System.out.println("Ingrese el número de ejercicio que desea ejecutar (0 para salir): ");
        }
}
