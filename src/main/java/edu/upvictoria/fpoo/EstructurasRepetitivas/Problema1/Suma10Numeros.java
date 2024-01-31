package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema1;

public class Suma10Numeros {
    public static float Sumar(float [] valores){
    float suma=0;
    int i=0;
    while(i<10){
        suma+= valores[i];
        i++;
    }
        return suma;
    }
}
