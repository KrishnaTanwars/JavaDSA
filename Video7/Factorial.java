import java.util.Scanner;

public class Factorial {
    public static void Fact(int n) {
        if(n<0){
            System.out.println("Invalid");
            return;
        }
        
        int p =1;
        for(int i = n;i>=1;i--){
            p = p*i;
        }
        System.out.println(p);
        return;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fact(n);
        
    }
    
}
