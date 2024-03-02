package TP3;

import java.util.*;

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
        Arrays.sort(t);
        reverse(t);
        System.out.println(Arrays.toString(t));
    }
    public static int[] reverse(int[] a){
        int i = 0, j = a.length - 1;
        while (i < j){
            int temp = a[i];
            a[i]= a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }
}
