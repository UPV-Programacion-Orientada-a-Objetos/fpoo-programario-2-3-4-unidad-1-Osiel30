package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema6;
public class Ahorro {
    public static double AhorroAnual(float[] Dinero, int meses) {
        double sumaAhorro = 0.0;
        for (int i=0; i<meses; i++) {
            sumaAhorro += Dinero[i];
            System.out.println("Su ahorro hasta este punto es: "+ sumaAhorro);
        }
        return sumaAhorro;
    }
}
