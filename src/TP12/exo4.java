package TP12;

import java.util.Scanner;

public class exo4 {
    public static int div(int n){
        int somme = 0;
        int root = (int) Math.sqrt(n);
        for (int i = 2; i <= root; i++) {
            if (n % i == 0) {
                somme += i;
                if (i != n / i && n/i != n)
                    somme += n / i;
            }
        }
    return somme;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("n = ");
        int n = s.nextInt();
        System.out.print("m = ");
        int m = s.nextInt();
        s.close();
        int sommen = div(n);
        int sommem = div(m);
        if(sommen == m && sommem == n) System.out.println("(๑˘︶˘๑)!\nAmis!");
        else System.out.println(" ¯\\_(◕﹏◕)_/¯\nPas Amis!");
    }
}
