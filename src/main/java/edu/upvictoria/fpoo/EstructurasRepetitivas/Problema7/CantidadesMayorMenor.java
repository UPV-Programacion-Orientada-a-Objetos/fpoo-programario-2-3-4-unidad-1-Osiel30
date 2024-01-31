package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema7;
public class CantidadesMayorMenor {
    public static void calcularCantidades(double[] numeros) {
        int cantidadesMenoresOIgualesACero = 0;
        int cantidadesMayoresACero = 0;

        for (double numero : numeros) {
            if (numero <= 0) {
                cantidadesMenoresOIgualesACero++;
            } else {
                cantidadesMayoresACero++;
            }
        }
        System.out.println("Cantidad de números menores o iguales a cero: " + cantidadesMenoresOIgualesACero);
        System.out.println("Cantidad de números mayores a cero: " + cantidadesMayoresACero);
    }
}
