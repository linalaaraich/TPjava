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
        int ecart = 0;
        for(int i = 0;i < n/2; i++){
            for(int j = 0;j < n; j++){
                if(Math.abs(t[j]-t[i]) > ecart) ecart = Math.abs(t[j]-t[i]);
            }

        }
        System.out.println(Arrays.toString(t));
        System.out.println("Plus grand ecart : " + ecart);
        //(l'écart est la valeur absolue de la différence de deux éléments)
    }
}
