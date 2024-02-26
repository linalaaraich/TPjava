package TP1;

import java.util.Scanner;

public class exo1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Entier 1 : ");
        int a = s.nextInt();
        System.out.print("Entier 2 : ");
        int b = s.nextInt();
        s.close();
        System.out.println("Somme: "+ a+b +"Quotient: "+ a/b);
        System.out.println("Difference: "+ (a-b));
        System.out.println("Produit: "+ a*b);
        System.out.println("Quotient: "+ a/b);
    }
}
