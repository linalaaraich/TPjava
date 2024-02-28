package TP2;
import java.util.Scanner;
public class exo6 {
    public static boolean premier(int n){
        int i = 2;
        while(i < n){
            if(n % i == 0) return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("n = ");
        int n = s.nextInt();
        s.close();
        if( premier(n) ) {
            System.out.println(n +" est premier");
        } else {
            System.out.println(n + " n'est pas premier");
            while(n >= 1) {
                if (premier(n)) System.out.println(n + " est premier");
                n--;
            }
        }
    }
}
