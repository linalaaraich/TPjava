package TP1;

import java.util.Scanner;

public class exo8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("a = ");
        int a = s.nextInt();
        System.out.print("b = ");
        int b = s.nextInt();
        s.close();
        if(b>a){
            int temp = a;
            a = b;
            b = temp;
        }
        //implementation PGCD
        int reste;
        while(b != 0){
            reste = a % b;
            a = b;
            b = reste;
        }
        System.out.println(a);
    }
}
