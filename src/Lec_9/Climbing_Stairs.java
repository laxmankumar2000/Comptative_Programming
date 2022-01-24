package Lec_9;

public class Climbing_Stairs {
    public static void main(String[] args) {
        int n=40;
        System.out.println(nooways(n));
        int[] dp = new int[n+1];
        System.out.println(noowaysdp(n,dp));
    }

    public static int  nooways(int n)
    {
        if (n==0)
            return 1;
        if (n<0)
            return 0;

        int one = nooways(n-1);
        int two = nooways(n-2);
        return one+two;

    }

    public static int  noowaysdp(int n , int[] dp)
    {
        if (n==0)
            return 1;
        if (n<0)
            return 0;

        if(dp[n]!=0)
            return dp[n];
        int one = noowaysdp(n-1,dp);
        int two = noowaysdp(n-2,dp);
        dp[n] = one+two;
        return one+two;

//        return dp[n] = one +two    ans yad kr rhe ho or return bhi kr rhe ho

    }
}
