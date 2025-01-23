import java.util.Scanner;

public class TwoProduct {
    public static int Product(int a, int b) {
        int prod = a * b;
        return prod;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = Product(a,b);
        System.out.println(prod);
        
    }
}
