package TP1;

import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("a = ");
        int a = s.nextInt();
        System.out.print("b = ");
        int b = s.nextInt();
        System.out.print("c = ");
        int c = s.nextInt();
        s.close();

        int delta = (int) Math.sqrt(Math.pow(b,2)-4*a*c);
        int x1 = (-b-delta)/(2*a);
        int x2 = (-b+delta)/(2*a);

        System.out.print("x1 = " + x1 + "\nx2 = " + x2);
    }
}
