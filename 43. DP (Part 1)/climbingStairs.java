import java.util.Arrays;

public class climbingStairs {
    public static int counter(int n, int ways[]) {

        // MEMOIZATION - O(n) | RECURSION - 2^n -> n = 10^5
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (ways[n] != -1) {// Already calculated
            return ways[n];

        }
        ways[n] = counter(n - 1, ways) + counter(n - 2, ways);
        return ways[n];
    }

    

    // public static int fib(int n) {
    // if(n ==0 || n == 1){
    // return n;
    // }
    // return fib(n-1) + fib(n-2);

    // }

    //TABULATION

    public static int CounterTab(int n, int dp[]) {
        for(int i =1; i<=n+1; i++ ){
            if(n == 1){
                dp[n] = dp[n-1] + 0;
            }
            else{
            dp[n] = dp[n-1] + dp[n-2];
            }
        }
        return dp[n];
        
    }

    public static void main(String[] args) {
        int n = 5;
        int ways [] = new int[n + 1];
        Arrays.fill(ways, -1);
        int way = counter(n, ways);
        int DP = CounterTab(n, ways);
        System.out.println(way);
        System.out.println(DP);
    }
}