package TP2;

import java.util.Scanner;
public class exo3 {
    public static void main(String[] args){
        //some des N premiers termes de la serie harmonique 1 + 1/2 + 1/3 + 1/4 + 1/5 +...+1/n
        Scanner s = new Scanner(System.in);
        System.out.print("N = ");
        int n = s.nextInt();
        s.close();

        double h = 0;
        while(n > 1){
            h += (double) 1 /n;
            n--;
        }
        System.out.println("La somme de la serie harmonique est: " + h);
    }
}
