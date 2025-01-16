public class power_stack_n {
    public static int CalcPow(int x, int n) {
        if(n == 0){ // base case 1
            return 1;
        }

        if(x == 0){ // base case 2
            return 0;
        }


        int powernm1 = CalcPow(x, n - 1); // kaam
        int  powern = x*powernm1;
        return powern;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = CalcPow(x, n);
        System.out.println(ans);
    }
    
}
