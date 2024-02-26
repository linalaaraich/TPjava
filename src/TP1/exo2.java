package TP1;

import java.util.Scanner;

public class exo2 {
    //demande rayon d’un cercle et lui affiche sa surface et son périmètre.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("rayon du cercle: ");
        int a = s.nextInt();
        s.close();
        System.out.println("surface: " + Math.PI*Math.pow(a, 2));
        System.out.println("perimetre: " + (2*Math.PI*a));

    }
}
