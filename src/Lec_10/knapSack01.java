package Lec_10;

import java.util.Arrays;

public class knapSack01 {
    public static void main(String[] args) {
        int[] wt ={ 1, 2, 3, 2, 2 };
        int[] cost = { 8, 4, 0, 5, 3 };
        int w =4;
        int[][] dp = new int[wt.length][w+1];
        for (int[] i:dp)
        {
            Arrays.fill(i,-1);
        }

        System.out.println(knapsack(wt,cost,w,0,dp));

    }
    static int knapsack(int[] wt,int[] cost, int w, int i,int[][] dp)
    {
        if (w==0 || i==wt.length)
            return 0;
        if (dp[w][i]!=-1)
            return dp[i][w];
        int inc = 0;
        int exc = 0;
        if (w>=wt[i])
            inc+=cost[i]+knapsack(wt,cost,w-wt[i],i+1,dp);
        exc+=knapsack(wt,cost,w,i+1,dp);
        return dp[i][w]=Math.max(inc,exc);

    }
}
