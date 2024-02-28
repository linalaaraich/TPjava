package TP2;

import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("n = ");
        int n = s.nextInt();
        s.close();
        long f = 1;
        while(n >= 1){
            f *= n;
            n--;
        }
        System.out.print("n! = " + f);
    }
}
