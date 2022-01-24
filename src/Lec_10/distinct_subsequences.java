package Lec_10;

import java.util.Arrays;

public class distinct_subsequences {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        int[][] dp = new int[s.length()+1][t.length()];

        System.out.println(no_of_ways(s,t,0,0));
        for (int[] i :dp)
        {
            Arrays.fill(i,-1);
        }
        System.out.println(no_of_ways_dp(s,t,0,0,dp));

    }
    //coin == s ,,,   amount = t;
    private static int no_of_ways(String s,String t, int m, int n)
    {
        if (n==t.length())
            return 1;
        if (m==s.length())
            return 0;

        int inc = 0;
        int exc = 0;

        if(s.charAt(m)==t.charAt(n))
            inc+=no_of_ways(s,t,m+1,n+1);
        exc+=no_of_ways(s,t,m+1,n);
        return inc+exc;

    }
    static int no_of_ways_dp(String s, String t,int m , int n, int[][] dp)
    {
        if (n==t.length())
            return 1;
        if (m==s.length())
            return 0;
        if (dp[m][n]!=-1)
            return dp[m][n];
        int inc = 0;
        int exc = 0;
        if (s.charAt(m)==t.charAt(n))
            inc+=no_of_ways_dp(s,t,m+1,n+1,dp);
        exc+=no_of_ways_dp(s,t,m+1,n,dp);
        return dp[m][n] = inc+exc;
    }
}
