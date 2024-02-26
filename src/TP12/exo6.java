package TP12;

import java.util.Scanner;

public class exo6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Poids (kg): ");
        float poids = s.nextFloat();
        System.out.print("Taille (m): ");
        float taille = s.nextFloat();
        System.out.print("Sexe (F ou H): ");
        s.nextLine();
        String sexe = s.nextLine();
        double imc = poids/Math.pow(taille,2);
        if(sexe.equals("F")){
            if( imc <= 19 ) System.out.println("Maigreur");
            else if( imc > 19 && imc <= 24) System.out.println("Poids Normal");
            else if( imc > 24 && imc <= 30) System.out.println("Surchage ponderale");
            else if( imc > 30 && imc <= 40) System.out.println("Adiposite");
            else System.out.println("Obeseite");
        }else{
            if( imc <= 20 ) System.out.println("Maigreur");
            else if( imc > 20 && imc <= 25) System.out.println("Poids Normal");
            else if( imc > 25 && imc <= 30) System.out.println("Surchage ponderale");
            else if( imc > 30 && imc <= 40) System.out.println("Adiposite");
            else System.out.println("Obeseite");
        }
        s.close();
    }
}
