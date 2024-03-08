package TP12;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nh,nm;
        System.out.print("Heure: ");
        int h = s.nextInt();
        System.out.print("Minute: ");
        int m = s.nextInt();
        s.close();
        nm = m + 1;
        nh = h;
        if(m == 59){
            nm = 0;
            nh += 1;
            if(h == 23) nh = 0;
        }
        System.out.printf("%02d:%02d", nh, nm);
    }
}
