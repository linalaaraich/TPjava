package TP2;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("n = ");
        int n = s.nextInt();
        s.close();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) System.out.print("*");
        System.out.println();
        }

    }
}
