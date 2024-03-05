package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class exo8 {
    public static void main(String[] args){
        //Écrire un programme qui calcule le plus grand écart dans un tableau.
        Scanner s = new Scanner(System.in);
        System.out.print("N = ");
        int n = s.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + " :  ");
            t[i] = s.nextInt();
        }
        s.close();
        int[] t0 = new int[n];
        System.arraycopy(t, 0, t0, 0 , n);
        Arrays.sort(t0);
        int ecart = Math.abs(t0[n - 1] - t[0]);
        System.out.println(Arrays.toString(t));
        System.out.println("Plus grand ecart : " + ecart);
        //(l'écart est la valeur absolue de la différence de deux éléments)
    }
}
