package TP2;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("X = ");
        int x = s.nextInt();
        System.out.print("N = ");
        int n = s.nextInt();
        s.close();
        double power = 1;
        for(int i = 1;i <= n; i++) power *= x;
        System.out.println(power);

    }
}
