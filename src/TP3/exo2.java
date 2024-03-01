package TP3;

import java.util.Scanner;

public class exo2 {
    public static void main(String[] args){
        //demande declaration d'un tableau de 10 elements puis le afficher
        Scanner s = new Scanner(System.in);
        int[] tableau= new int[10];
        for(int i = 0;i < 10;i++){
            System.out.print("Element " + i + " :  ");
            tableau[i] = s.nextInt();
        }
        s.close();
        for(int i = 0;i < 10;i++){
            System.out.print("| " + tableau[i] + " |");


        }
    }
}
