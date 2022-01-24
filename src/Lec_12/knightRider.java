package Lec_12;

public class knightRider {
    static int[] row = {-2,-1,1,2,2,1,-1,-2};
    static int[] col = {-1,-2,-2,-1,1,2,2,1};
    public static void main(String[] args) {
        int n =2;
        int[][] grid = new int[4][3];
        int res = 0;
        for (int i = 0; i < 4; i++) {
            for (int j=0;i<3;j++)
            {
                res =(res+ knightRiderSol(n-1,i,j))%1000000007;
            }

        }
        System.out.println(res);

    }
    static int knightRiderSol(int n , int cr, int cc)
    {
        if(cr<0 || cr>=4 || cc<0 || cc>=3 || (cr==3 && cc==0) || (cr==3 && cc==2))
            return 0;
        if (n==0)
            return 1;
        int ans = 0;
        for (int i =0;i<row.length;i++)
        {
            ans+=knightRiderSol(n-1,cr+row[i],cc+col[i]);
        }
        return ans;
    }
}
