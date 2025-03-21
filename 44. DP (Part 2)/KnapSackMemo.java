public class KnapSackMemo {
    public static int knapsack(int val[], int wt[], int W, int n, int dp[][]) {
        if(W==0 || n==0){
            return 0;
        }
        if(dp [n][W]!=-1){//Already Calculated
            return dp[n][W];

        }
        if(wt[n-1]<=W){
            //VALID
            //INCLUDE
            int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1, dp);

            //EXCLUDE
            int ans2 = knapsack(val, wt, W, n-1, dp);
            dp[n][W]=Math.max(ans1, ans2);
            return dp[n][W];
        }
        else{
            //NOT VALID
            dp[n][W] = knapsack(val, wt, W, n-1,dp);
            return dp[n][W];
        }        
    }
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        //MEMOIZATION
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i = 0; i<dp.length;i++){
            for(int j = i; j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsack(val, wt, W, n, dp));
    }
    
}
