package TP1;

import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        int factoriel;
        Scanner s = new Scanner(System.in);
        System.out.print("x = ");
        int x = s.nextInt();
        s.close();
        for(int i = 1; i <= x; i++)  factoriel = x*i;
    }
}
