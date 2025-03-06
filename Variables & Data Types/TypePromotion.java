import java.util.Scanner;

public class TypePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char a = 'a';
        // char b = 'b';
        // System.out.println(b-a);

        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte)(a+b+c);
        // System.out.println(bt);

        // int a = 10;
        // float b =   20.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a + b + c + d;
        // System.out.println(ans);

        byte b  =25;
        byte a = (byte)(b * 10);
        System.out.println(a);
    }
    
}
