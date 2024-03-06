package TP1;

import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //demande rayon d’un cercle
        System.out.print("rayon du cercle: ");
        int a = s.nextInt();
        s.close();
        //affiche sa surface et son périmètre.
        System.out.println("surface: " + Math.PI*Math.pow(a, 2));
        System.out.println("perimetre: " + (2*Math.PI*a));

    }
}
