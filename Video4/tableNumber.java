package Video4;

import java.util.Scanner;

public class tableNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for(int i = 1; i < 11; i++){
            System.out.println(n+"  x  "+i+"  = "+" "+n*i);
         }
    }
    
}
