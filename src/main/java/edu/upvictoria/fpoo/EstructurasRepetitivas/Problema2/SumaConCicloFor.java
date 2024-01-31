package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema2;

public class SumaConCicloFor {
    public static float Sumar(float [] valores){
        float suma=0;

        for(int i=0; i<10; i++){
            suma+= valores[i];
        }
        return suma;
    }
}
