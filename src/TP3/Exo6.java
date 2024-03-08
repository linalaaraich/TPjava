package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6 {
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

        int[] tp0 = new int[n], tn0 = new int[n];
        int p = -1, ne = -1;
        for(int i = 0;i < n;i++) {
            if (t[i] < 0){
                ne++;
                tn0[ne] = t[i];
            } else if (t[i] > 0) {
                p++;
                tp0[p] = t[i];
            }
        }
        int[] tp = new int[p+1], tn = new int[ne+1];
        System.arraycopy(tp0, 0, tp, 0, p + 1);
        System.arraycopy(tn0, 0, tn, 0, ne + 1);
        System.out.println("tableau negatif: " + Arrays.toString(tn));
        System.out.println("tableau positif: " +Arrays.toString(tp));

    }
}

