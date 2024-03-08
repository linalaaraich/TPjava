package TP12;
import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        int[] buts = new int[22];
        int buteur = 0, butsTotales = 0, wasteOfSpace = 0, max = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("| N° Du Jouer | Nb des buts");
        for(int i = 0;i < 22; i++){
            buts[i] = i;
            System.out.printf("| Jouer N° %02d | ", i + 1);
            buts[i] = s.nextInt();
            butsTotales += buts[i];
            if(buts[i] == 0) wasteOfSpace ++;
            if ( buts[i] > max) {
                max = buts[i];
                buteur = i + 1;
            }
        }
        s.close();

        System.out.println("Le buteur : Jouer N°" + buteur);
        System.out.println("Nombre des buts: " + butsTotales);
        System.out.println("Nombres des joueurs qui n'on pas marque: " + wasteOfSpace);
    }
}
