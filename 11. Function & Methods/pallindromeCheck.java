import java.util.*;

public class pallindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pallindrome(n));
        
    }
    public static int pallindrome(int n){
        int m = n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        return rev;
        
    }
    
}
