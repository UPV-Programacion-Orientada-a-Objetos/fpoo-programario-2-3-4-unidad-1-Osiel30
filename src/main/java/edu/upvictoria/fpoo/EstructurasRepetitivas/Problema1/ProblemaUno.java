package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ProblemaUno {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float[] valores= new float[10];
        int contador = 0;
        try {
            while (contador < 10) {
                System.out.print("Ingrese el valor " + (contador + 1) + ": ");
                float valor = Float.parseFloat(br.readLine());
                valores[contador] = valor;
                contador++;
            }
            float resultado = Suma10Numeros.Sumar(valores);
            System.out.println("La suma de los valores es: " + resultado);


        } catch (IOException | NumberFormatException e) {
            System.err.println("Error de entrada/salida o formato de número inválido.");
            e.printStackTrace();
        }
    }

}
