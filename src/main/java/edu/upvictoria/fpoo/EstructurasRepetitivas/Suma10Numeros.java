package edu.upvictoria.fpoo.EstructurasRepetitivas;

public class Suma10Numeros {
    public static float Sumar(float [] valores){
    float suma=0;
    for(int i=0; i<10; i++){
        suma+= valores[i];
    }
        return suma;
    }
}
