package Lec_9;

public class house_Robber {
    public static void main(String[] args) {
        int[] arr ={2,1,1,2};
        int n = arr.length;

        int[] dp = new int[n];

        System.out.println(robRec(arr,0));

        System.out.println(robDp(arr,0,dp));
    }

    public static  int robRec(int[] arr,int i)
    {
        if(i>=arr.length)
            return 0;
        int rob = arr[i] + robRec(arr,i+2);
        int dontrob = robRec(arr,i+1);
        return  Math.max(rob,dontrob);
    }

    public static int robDp(int[] arr, int i ,int[] dp)
    {
        if(i>=arr.length)
            return 0;
        if(dp[i]!=0)
            return dp[i];
        int rob = arr[i] + robDp(arr,i+2 ,dp);
        int dontrub = robDp(arr,i+1,dp);
        return dp[i] = Math.max(rob,dontrub);

    }
}
