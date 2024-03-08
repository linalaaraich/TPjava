package TP3;
import java.util.Scanner;
public class Exo1 {
    //declarer et initialiser un tableau puis affiche les elements du tableau
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Le nombre de lignes: ");
        int a = s.nextInt();
        System.out.print("Le nombre de colones: ");
        int b = s.nextInt();
        int[][] tableau= new int[a][b];
        for(int i = 0;i < a;i++){
            System.out.print("Ligne " + i + " :  ");
            for(int j = 0;j < b; j++) tableau[i][j] = s.nextInt();
        }
        s.close();
        for(int i = 0;i < a;i++){
            System.out.print("| ");
            for(int j = 0;j < b; j++) {
                System.out.print(tableau[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

    }
}
