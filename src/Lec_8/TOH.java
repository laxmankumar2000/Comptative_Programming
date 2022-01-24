package Lec_8;

public class TOH {
    public static void main(String[] args) {
        int n = 3;
        int length = TohSol(n,"SRC","HLP","DES");
        System.out.println(length);
    }

    private static int TohSol(int n, String src, String hlp, String des) {
        if (n==1)
        {
            System.out.println("Move Disc " + n+"th" + " from " + src + " to "+ des);
            return 1 ;
        }
        int length = 1;
        length+=TohSol(n-1,src,des,hlp);
        System.out.println("Move Disc " +n+" th from " + src + " to "+ des );
       length+=TohSol(n-1,hlp,src,des);
       return length ;
    }
}
