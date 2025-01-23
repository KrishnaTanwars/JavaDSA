package Video8;

import java.util.Scanner;

public class Circumference {
    public static void Cir(int r) {
        int circum = 2*(22/7)*r;
        System.out.println(circum);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Cir(r);


        
    }
}
