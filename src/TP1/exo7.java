package TP1;

import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("E:  ax^2 + bx + c = 0");
        System.out.print("a = ");
        int a = s.nextInt();
        System.out.print("b = ");
        int b = s.nextInt();
        System.out.print("c = ");
        int c = s.nextInt();
        s.close();
        double x1, x2, z, y;
        float delta = (float) Math.pow(b,2)-4*a*c;
        if(delta >= 0){
            x1 = (-(float)b-Math.sqrt(delta))/(2*(float)a);
            x2 = (-(float)b+Math.sqrt(delta))/(2*(float)a);
            System.out.print("x1 = " + x1 + "\nx2 = " + x2);
        }else{
            z = -(float)b/(2*(float)a);
            y = -Math.sqrt(-delta)/(2*(float)a);
            if(y>0) System.out.print("x1 = " + z +" + i*"+ y + "\nx2 = " + z +" - i*"+ y);
            else System.out.print("x1 = " + z +" + i*"+ Math.abs(y) + "\nx2 = " + z +" - i*"+ Math.abs(y));
        }
    }
}
