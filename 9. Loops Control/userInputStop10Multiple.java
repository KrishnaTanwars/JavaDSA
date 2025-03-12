import java.util.Scanner;

public class userInputStop10Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter no");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
    
}
