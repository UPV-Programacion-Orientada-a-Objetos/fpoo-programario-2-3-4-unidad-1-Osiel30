package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema10;

public class Paga {
    public static double PagaSemanal(float[] Dinero) {
        double sumaAhorro = 0.0d;
        double paga = 241.36d;
        for (int i=0; i<6; i++) {
            sumaAhorro += Dinero[i]* paga;
        }
        return (double)sumaAhorro;
    }
}
