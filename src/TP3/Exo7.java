package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        //1.	Demand1.	Demande à l’utilisateur de saisir la taille du tableau
        Scanner s = new Scanner(System.in);
        System.out.print("Taille du tableau = ");
        int n = s.nextInt();
        //2.	Crée un objet tableau avec la taille entrée par l’utilisateur
        int[] t = new int[n];
        //3.& 4	Demande à l’utilisateur de remplir le tableau & Calcule la somme des éléments saisis
        int somme = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + " :  ");
            t[i] = s.nextInt();
            somme += t[i];
        }
        s.close();
        //5.	Calcule la moyenne des éléments
        float moyenne = (float) somme/n;
        System.out.println("Somme: " + somme + "\nMoyenne: " + moyenne);
        //6.	Copier le tableau dans un deuxième tableau T2 et l’afficher
        int[] T2 = new int[n];
        System.arraycopy(t, 0, T2, 0, n);
        System.out.println("Elements de T2:");
        System.out.println(Arrays.toString(T2));
        //7.    Classer les elements du tableau dans un ordre croissant
        Arrays.sort(t);
        System.out.println("En ordre croissant:");
        System.out.println(Arrays.toString(t));
    }
}
