package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema5;
public class Estatura {
    public static double calcularEstatura(float[] Altura, int numPersonas) {
        float sumaEstatura = 0;
        for (float edad : Altura) {
            sumaEstatura += edad;
        }
        return sumaEstatura / numPersonas;
    }
}
