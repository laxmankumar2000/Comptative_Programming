package Lec_5;

public class LongPath {
    public static void main(String[] args) {
        int  row = 3;
        int col = 4;

        mazepath(0,0,row,col,"");

    }

    public static  void mazepath(int cr , int cc , int er , int ec , String ans)
    {
        if(cr == er-1 && cc == ec-1)
        {
            System.out.println(ans);
        }
        if(cr >=er || cc>=ec)
        {
            return;
        }
//        mazepath();

    }
}
