package Lec_10;

import java.util.Arrays;

public class coinChange {
    public static void main(String[] args) {
        int[] coin = {1,2,5};
        int amount = 5;
        System.out.println(no_of_ways(coin,amount,0,""));


        int[][] dp = new int[amount+1][coin.length];
        for (int[] i:dp)
        {
            Arrays.fill(i,-1);
        }
        System.out.println(no_of_ways_dp(coin,amount,0,dp));




    }

    private static int no_of_ways_dp(int[] coin, int amount, int i, int[][] dp) {
        if (amount==0)
            return 1;
        if (i==coin.length)
            return 0;
        if (dp[amount][i]!=-1)
            return dp[amount][i];
        int inc = 0;
        int exc = 0;
        if (amount>=coin[i])
            inc+=no_of_ways_dp(coin,amount-coin[i],i,dp);
        exc+=no_of_ways_dp(coin,amount,i+1,dp);
        return dp[amount][i] = inc+exc;
    }

    static  int no_of_ways(int[] coin , int amount, int i ,String ans)
    {
        if (amount==0) {

            System.out.print(ans+ " ");
            return 1;
        }
        if (i==coin.length) {

            return 0;
        }


        int inc = 0;
        int exc = 0;
        if (amount>=coin[i])
            inc+=no_of_ways(coin , amount-coin[i], i, ans+coin[i]);
        exc+=no_of_ways(coin,amount,i+1,ans);

        return inc+exc;
    }
}
