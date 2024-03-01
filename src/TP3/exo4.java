package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class exo4 {
    public static int[] effacer( int[] t){
        for(int i = 0;i < 5;i++)
            t[i] =0;
        return t;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        do{
            System.out.print("N = ");
            n = s.nextInt();
        }while(n > 50 || n < 10);
        int[] t = new int[n];
        for(int i = 0;i < 10;i++){
            System.out.print("Element " + i + " :  ");
            t[i] = s.nextInt();
        }
        s.close();
        System.out.println(Arrays.toString(t));
        //Arrays.fill(t, 0, 5, 0);
        System.out.println(Arrays.toString(effacer(t)));
    }

}
