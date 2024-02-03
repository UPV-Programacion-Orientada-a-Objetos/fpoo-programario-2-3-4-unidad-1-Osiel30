package edu.upvictoria.fpoo.Arreglos.Problema4;
public class Productos {
    public static void run(int[] A, int[] B) {
        int[] C = new int[10];

        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i]) {
                C[i] = A[i];
            } else if (B[i] > A[i]) {
                int diferencia = B[i] - A[i];
                C[i] = 2 * diferencia;
            } else {
                C[i] = B[i];
            }
        }

        System.out.print("Vector C: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}