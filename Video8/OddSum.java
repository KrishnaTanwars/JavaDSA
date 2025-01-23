package Video8;

import java.util.Scanner;

public class OddSum {
    public static void Odd(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                s += i;
            }
        }
        System.out.println(s);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Odd(n);

    }
}
