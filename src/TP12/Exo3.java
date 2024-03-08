package TP12;
import java.util.Scanner;
import static TP12.Exo4.div;

public class Exo3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("n = ");
        int n = s.nextInt();
        s.close();
        int somme = div(n) + 1;
        if(somme == n) System.out.println("Le nombre est parfait");
        else System.out.println("Le nombre n'est pas parfait");
    }
}
