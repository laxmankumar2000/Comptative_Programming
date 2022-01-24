package Lec_5;

public class maze_path {
    public static void main(String[] args) {
        int m =3;
        int n=3;
        maze_path_sol(0,0,m,n,"");
    }

    private static void maze_path_sol(int cr, int cc, int er, int ec, String ans) {
        if (cr==er-1 || cc == ec-1)
        {
            System.out.println(ans);
            return;
        }
        if (cr>=er || cc>= ec)
            return;

        maze_path_sol(cr+1,cc,er,ec,ans+"H");
        maze_path_sol(cr,cc+1,er,ec,ans+"V");

    }
}
