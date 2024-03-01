package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class exo5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("N = ");
        int n = s.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + " :  ");
            t[i] = s.nextInt();
        }
        s.close();

        System.out.println(Arrays.toString(arrangeArray(t)));
    }
    public static int[] arrangeArray(int[] a){
        int temp = a[0];
        int order = 1;
        do{
            for(int i = 1; i < a.length; i++){
                if(a[i] > temp){
                    a[i-1] = a[i];
                    a[i] = temp;
                }
                temp = a[i];
            }
            for(int i = 1; i < a.length ; i++){
                order = 0;
                if(a[i-1]>=a[i]) order += 0;
                else order += 1;
            }
        } while(order != 0);
        return a;
    }
}
