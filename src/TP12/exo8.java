package TP12;

import java.util.Scanner;

public class exo8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Age: ");
        int age = s.nextInt();
        System.out.print("Sexe (F ou H): ");
        s.nextLine();
        String sexe = s.nextLine();
        s.close();
        if((sexe.equals("H") && age > 20) || (sexe.equals("F") && age > 18 && age < 35)) System.out.println("Paie l'impot");
        else System.out.println("Pas d'impot");
    }
}
