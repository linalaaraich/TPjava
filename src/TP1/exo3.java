package TP1;
import java.util.Scanner;

public class exo3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("a : ");
        int a = s.nextInt();
        System.out.println("b : ");
        int b = s.nextInt();
        s.close();
        int temp = a;
        a = b;
        b = temp;
    }
}
