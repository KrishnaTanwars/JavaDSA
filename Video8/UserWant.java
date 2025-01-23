package Video8;

import java.util.Scanner;

public class UserWant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ask;
        int positivecount = 0, negativecount = 0, zerocount = 0;
        do {
            int n = sc.nextInt();
            ask = sc.next();

            if (n > 0) {
                positivecount++;

            } else if (n == 0) {
                zerocount++;
            } else {
                negativecount++;
            }

        } while (ask.equals("y"));
        System.out.println("Postive: " + positivecount);
        System.out.println("Negative: " + negativecount);
        System.out.println("Zero: " + zerocount);

    }

}
