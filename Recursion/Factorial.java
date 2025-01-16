public class Factorial {
    public static int Fac(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        int fact_n1 = Fac(n-1);
        int fact_n = n* fact_n1;
        return fact_n;
        
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fac(n));
    }
    
}
