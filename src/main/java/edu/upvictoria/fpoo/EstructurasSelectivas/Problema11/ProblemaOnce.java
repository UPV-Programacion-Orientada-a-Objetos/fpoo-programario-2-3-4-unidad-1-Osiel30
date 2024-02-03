package edu.upvictoria.fpoo.EstructurasSelectivas.Problema11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaOnce {
    public static void ElecciondeHamburguesa() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double HamburguesaSencilla = 20.00;
        double HamburguesaDoble = 25.00;
        double HamburguesaTriple = 28.00;

        System.out.println("Ingrese la cantidad de hamburguesas: ");
        int cantidadHamburguesas = Integer.parseInt(reader.readLine());

        System.out.println("Seleccione el tipo de hamburguesa (1 - Sencilla, 2 - Doble, 3 - Triple): ");
        int tipoHamburguesa = Integer.parseInt(reader.readLine());

        double costoTotal;

        switch (tipoHamburguesa) {
            case 1:
                costoTotal = HamburguesaSencilla * cantidadHamburguesas;
                break;
            case 2:
                costoTotal = HamburguesaDoble * cantidadHamburguesas;
                break;
            case 3:
                costoTotal = HamburguesaTriple * cantidadHamburguesas;
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.println("¿Desea pagar con tarjeta de crédito? (Sí/No): ");
        String opcionPago = reader.readLine();

        if (opcionPago.equalsIgnoreCase("Sí")) {
            double cargoTarjeta = costoTotal * 0.05;
            costoTotal += cargoTarjeta;
            System.out.println("El costo total con el cargo de tarjeta es: $" + costoTotal);
        } else {
            System.out.println("El costo total es: $" + costoTotal);
        }
    }
}