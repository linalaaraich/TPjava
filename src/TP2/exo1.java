package TP2;

import java.util.Scanner;

public class exo1 {
    public static void main(String[] args){
        float somme = 0, produit = 1;
        System.out.print("n = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print("Liste: ");
        for(int i = 0;i < n; i++){
            float temp = s.nextFloat();
            somme += temp;
            produit *= temp;
        }
        System.out.println("Somme = " + somme);
        System.out.println("Produit = " + produit);
        System.out.println("moyenne = " + somme/n);

    }
}
