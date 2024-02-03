package edu.upvictoria.fpoo.Arreglos.Problema3;
public class Ordenar {
    public static void ordenarPorPromedio(String[] nombres, double[] promedios) {
        int tamano = nombres.length;

        for (int i = 0; i < tamano - 1; i++) {
            for (int j = 0; j < tamano - 1 - i; j++) {
                if (promedios[j] < promedios[j + 1]) {
                    double auxPromedio = promedios[j];
                    promedios[j] = promedios[j + 1];
                    promedios[j + 1] = auxPromedio;

                    String auxNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = auxNombre;
                }
            }
        }
    }
}