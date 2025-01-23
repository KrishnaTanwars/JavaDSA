package Video8;

import java.util.Scanner;

public class AgeAbove18 {
    public static void age(int n) {
        if(n>=18){
            System.out.println("Eligible");
        }
        else {
            System.out.println("Ineligible");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        age(n);
        
    }
    
}
