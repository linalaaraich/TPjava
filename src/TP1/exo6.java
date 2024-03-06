package TP1;

import java.util.Scanner;

public class exo6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("E:  ax + b = 0");
        System.out.print("a = ");
        int a = s.nextInt();
        System.out.print("b = ");
        int b = s.nextInt();
        s.close();
        System.out.print("x = ");
        System.out.print(-(float)b/(float)a);

    }
}
