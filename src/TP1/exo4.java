package TP1;

import java.util.Scanner;

public class exo4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("x = ");
        float x = s.nextFloat();
        System.out.print("n = ");
        int n = s.nextInt();
        s.close();
        System.out.println(Math.pow(x,n));
    }
}
