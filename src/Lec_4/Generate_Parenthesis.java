package Lec_4;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        int n=3;

        List<String> list = new ArrayList<>();
        Generate_Parenthesis_leetcode(n,0,0,"",list);
    }

    private static void Generate_Parenthesis_leetcode(int n, int opening, int closing, String ans, List<String> list) {
        if(opening == n || closing == n)
        {
            System.out.println(ans);
            return;
        }
        if (opening<n)
            Generate_Parenthesis_leetcode(n , opening+1 , closing , ans+"(" , list);
        if (closing<opening)
            Generate_Parenthesis_leetcode(n,opening , closing+1 , ans+")" , list);
    }
}
