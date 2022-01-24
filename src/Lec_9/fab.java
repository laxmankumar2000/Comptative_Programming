package Lec_9;

public class fab {
    public static void main(String[] args) {
        int n=6;
        int[] dp = new int[n+1];
        System.out.println("With out DP   " +fib(n));
        System.out.println(fibdp(n,dp));
        System.out.println(fibSpace(n));
    }

//

    static int fib(int n )
    {
        if (n==1 || n==0) {

            return n;
        }
        int stp1 = fib(n-1 );
        int stp2 = fib(n-2 );
        return stp1 + stp2;
    }

    static int fibdp(int n , int[] dp)
    {
        if (n==1 || n==0)
        {
            return n;
        }
        if (dp[n]!=0)
        {
            return dp[n];
        }
        int st1= fibdp(n-1,dp);
        int st2 = fibdp(n-2,dp);
        dp[n] = st1+st2;
        return dp[n];
    }

    public static int fibSpace(int n)
    {
        int a = 0;
        int b = 1;
        int i = 1;
        while(i<=n)
        {
            int c = a+b;
            a=b;
            b=c;
            i++;
        }
        return  a;
    }
}
