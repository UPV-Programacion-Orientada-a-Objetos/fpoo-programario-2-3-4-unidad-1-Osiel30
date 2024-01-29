package edu.upvictoria.fpoo.EstructurasRepetitivas;

public class SumaConCicloDoWhile {
    public static float Sumar(float[] valores) {
        float suma = 0;
        int i = 0;
        do {
            suma += valores[i];
            i++;
        } while (i < 10);
        return suma;
    }
}
