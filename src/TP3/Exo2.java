package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args){
        //demande declaration d'un tableau de 10 elements puis le afficher
        Scanner s = new Scanner(System.in);
        System.out.println("Tableau a 10 elements: ");
        int[] tableau= new int[10];
        for(int i = 0;i < 10;i++){
            System.out.print("Element " + i + " :  ");
            tableau[i] = s.nextInt();
        }
        s.close();
        System.out.println(Arrays.toString(tableau));

    }
}
