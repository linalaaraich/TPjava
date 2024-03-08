package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        do{
            System.out.print("N = ");
            n = s.nextInt();
        }while(n > 50 || n < 10);
        int[] t = new int[n];
        for(int i = 0;i < n;i++){
            System.out.print("Element " + i + " :  ");
            t[i] = s.nextInt();
        }
        s.close();
        System.out.println(Arrays.toString(t));
        //I can also use Arrays.fill(t, 0, 5, 0); to achieve a similar result of effacer
        System.out.println(Arrays.toString(effacer(t)));
    }
    public static int[] effacer( int[] t){
        for(int i = 0;i < 5;i++)
            t[i] =0;
        return t;
    }
}
