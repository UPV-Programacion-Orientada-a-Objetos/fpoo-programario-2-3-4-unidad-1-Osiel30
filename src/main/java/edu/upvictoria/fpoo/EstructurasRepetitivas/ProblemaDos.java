package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDos {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float[] valores= new float[10];
        try {
            for(int i=0; i<10;i++){
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                float valor = Float.parseFloat(br.readLine());
                valores[i] = valor;
                i++;
            }

            float resultado = SumaConCicloFor.Sumar(valores);
            System.out.println("La suma de los valores es: " + resultado);


        } catch (IOException | NumberFormatException e) {
            System.err.println("Error de entrada/salida o formato de número inválido.");
            e.printStackTrace();
        }
    }
}
