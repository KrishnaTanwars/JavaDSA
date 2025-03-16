import java.util.Scanner;

public class halfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int line = 1; line <= n; line++) {
            for (int count = 1; count <= line; count++) {
                System.out.print(count);
            }
            System.out.println();
        }
    }

}
