import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int fac = 1;
        while(i<=n){
            fac = fac * i;
            i++;
        }
        System.out.println(fac);
    }
    
}
