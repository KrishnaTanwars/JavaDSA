import java.util.Scanner;

public class calculateSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Sum(a, b));//Arguments or Actual Parameters

    }

    public static int Sum(int a, int b) {//Parameters or formal parameters
        int sum = a + b;
        return sum;

    }

}
