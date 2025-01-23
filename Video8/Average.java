package Video8;

import java.util.Scanner;

public class Average {
    public static void Avg(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println(avg);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Avg(a, b, c);

    }
}
