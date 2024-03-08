package TP12;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exo1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        do{
            System.out.print("Entir positif: ");
            a = s.nextInt();
        }while(a < 0);
        s.close();

        ArrayList<Integer> div = new ArrayList<>();
        int count = 0;
        int sum = 0;

        int root = (int) Math.sqrt(a);
        for(int i = 1;i <= root; i++){
            if(a % i == 0){
                count++;
                div.add(i);
                sum += i;
                if (i != a/i){
                    count ++;
                    div.add(a/i);
                    sum += (a / i);
                }
            }
        }
        Collections.sort(div);
        System.out.print("Les diviseurs sont: ");
        StringBuilder diviseurs = new StringBuilder();
        for(Integer i : div) {
            diviseurs.append(i).append(" ");
        }
        System.out.println(diviseurs);
        System.out.println("Le nombre des diviseurs est: " + count);
        System.out.println("La somme des diviseurs est: " + sum);

    }
}
