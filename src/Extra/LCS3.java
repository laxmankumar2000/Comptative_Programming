package Extra;

import  java.util.*;
public class LCS3 {
    public static void main(String[] args) {
        int[][][] dp = new int[4][4][4];
        for (int[][] i :dp)
        {
            for (int[] j :i) {
                Arrays.fill(j, -1);
            }
        }

        String s = "abc";
        String s1 = "acb";
        String s2 = "adc";
        if (s.charAt(0)==s1.charAt(0) || s.charAt(0)==s2.charAt(0))
        {

        }


//        System.out.println(LCS(s,s1,s2,0,0,0,dp));


    }
//    static int LCS(String s1,String s2, String s3, int i,int j,int k, int[][]dp)
//    {
//
//    }
}
