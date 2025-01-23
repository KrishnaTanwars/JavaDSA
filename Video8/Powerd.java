package Video8;
import java.util.Scanner;
public class Powerd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double pow = Math.pow(a, b);
        System.out.println(pow);
        
    }
}
