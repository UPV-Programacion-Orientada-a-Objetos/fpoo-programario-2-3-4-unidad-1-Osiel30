package edu.upvictoria.fpoo.EstructurasRepetitivas.Problema11;

public class Carretera {
    public static int Encuentro(int kmPersona1, int kmPersona2) {
        while (kmPersona1 != kmPersona2) {
            kmPersona1++;
            kmPersona2--;

            if (kmPersona1 > 200 || kmPersona2 < 0) {
                return -1;
            }
        }

        return kmPersona1;
    }
}
