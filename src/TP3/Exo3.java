package TP3;
import java.util.Arrays;
import java.util.Scanner;
public class Exo3 {
    public static void main(String[] args) {
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

    }
}
