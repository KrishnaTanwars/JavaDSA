import java.util.Scanner;

public class CostOfStat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float bill = a + b + c;
        float gst = bill * 0.18f;
        System.out.println(bill + gst);

        int $ = 24;
        System.out.println($);
        
    }
    
}
