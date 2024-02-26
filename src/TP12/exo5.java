package TP12;
import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        int[][] buts = new int[22][2];
        int buteur = 0, butsTotales = 0, wasteOfSpace = 0, max = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("| N° Du Jouer | Nb des buts");
        for(int i = 0;i < 22; i++){
            buts[i][0] = i;
            System.out.printf("| Jouer N° %02d | ", buts[i][0] + 1);
            buts[i][1] = s.nextInt();
            butsTotales += buts[i][1];
            if(buts[i][1] == 0){
                wasteOfSpace ++;
            }
            if ( buts[i][1] > max) {
                max = buts[i][1];
                buteur = i + 1;
            }
        }
        s.close();

        System.out.println("Le buteur : Jouer N°" + buteur);
        System.out.println("Nombre des buts: " + butsTotales);
        System.out.println("Nombres des joueurs qui n'on pas marque: " + wasteOfSpace);
    }
}
