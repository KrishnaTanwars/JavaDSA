package Video8;

import java.util.Scanner;

public class GreatestOfTwo {
    public static void Greatest(int a, int b) {
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Greatest(a, b);
        
    }
    
}
