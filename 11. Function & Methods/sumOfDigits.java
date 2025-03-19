import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int lastDig = n%10;
            sum+=lastDig;
            n/=10;
        }
        return sum;
    }
    
}
