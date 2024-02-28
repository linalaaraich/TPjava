package TP2;
import java.util.Scanner;
public class exo6 {
    //teste si un nb est premier, puis un programme qui teste tous les nombres entre 1 et n
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
            System.out.println("premier");
        } else {
            while(n > 1) {
                if (premier(n)) System.out.println("premier");
                n--;
            }
        }
    }
}
