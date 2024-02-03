package edu.upvictoria.fpoo.Arreglos.Problema2;
public class Suma {
    public static void sumarArreglos(float[] arregloA, float[] arregloB) {
        int tamano = arregloA.length;
        float[] arregloC = new float[tamano];

        for (int i = 0; i < tamano; i++) {
            arregloC[i] = arregloA[i] + arregloB[i];
        }
        mostrarResultado(arregloC);
    }
    private static void mostrarResultado(float[] arreglo) {
        System.out.print("La sumatoria es de: ");
        for (float elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }
}
