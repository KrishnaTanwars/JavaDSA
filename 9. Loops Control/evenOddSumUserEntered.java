import java.util.Scanner;

public class evenOddSumUserEntered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        Boolean istrue = true;

        do {
            System.out.print("Want to add more number(1:Yes)(0:NO): ");
            int choice = sc.nextInt();
            if (choice == 1) {
                istrue = true;
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                if (n % 2 == 0) {
                    even += n;
                } else {
                    odd += n;
                }
            } else {
                istrue = false;

                               
                System.out.println("Even sum = " + even);
                System.out.println("Odd sum = " + odd);
                

            }
        } while (istrue);
    }

}
