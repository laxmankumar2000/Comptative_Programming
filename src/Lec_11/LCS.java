package Lec_11;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ace";
        String str2 = "acedef";
        int[][] dp = new int[str1.length()][str2.length()];
        for (int[] i:dp)
        {
            Arrays.fill(i,-1);
        }
        System.out.println(lcs(str1,str2,0,0,dp));


    }
    private static int lcs(String st1, String st2, int i,int j, int[][] dp)
    {
        if (i==st1.length() || j ==st2.length())
            return 0;
        if (dp[i][j]!=-1)
            return dp[i][j];
        int ans = 0;
        if (st1.charAt(i)==st2.charAt(j))
        {
            ans+=1+lcs(st1,st2,i+1,j+1,dp);
        }
        else {
            int f1 = lcs(st1, st2, i + 1, j,dp);
            int f2 = lcs(st1, st2, i, j + 1,dp);
            ans += Math.max(f1, f2);
        }
        return dp[i][j] = ans;
    }
//        String s1="ace";
//        String s2="acedefc";
//        int[][] dp = new int[s1.length()][s2.length()];
//
//            for (int[] j:dp)
//            {
//                Arrays.fill(j,-1);
//            }
//
//        System.out.println(lcs(s1,s2,0,0,dp));
//
//    }
//    static  int lcs(String s1, String s2, int i, int j,int[][] dp)
//    {
//        if (i==s1.length() || j==s2.length())
//            return 0;
//        if (dp[i][j]!=-1)
//            return dp[i][j];
//        int ans = 0;
//        if(s1.charAt(i) == s2.charAt(j))
//            ans+=1+lcs(s1,s2,i+1,j+1,dp);
//        else
//        {
//            int fs1=lcs(s1,s2,i+1,j,dp);
//            int ss1=lcs(s1,s2,i,j+1,dp);
//            ans= Math.max(fs1,ss1);
//        }
//        return dp[i][j] = ans;
//
//    }
}
