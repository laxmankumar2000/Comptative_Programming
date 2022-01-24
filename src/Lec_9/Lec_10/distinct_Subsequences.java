package Lec_9.Lec_10;

public class distinct_Subsequences {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(no_ways(s,t,0,0));
    }
//    s-- coin  , m --- index ,
//    t --> amont  , n ---- index
    static int no_ways(String s , String t, int m , int n)
    {
        if (n==t.length())
            return 1;
        if (m==s.length())
            return 0;
        int inc = 0;
        int exc = 0;
        if (s.charAt(m)==t.charAt(m))
        {
            inc+=no_ways(s, t,m+1,n+1);
        }
        exc+=no_ways(s,t , m+1 , n);
        return inc+exc;
    }
}
