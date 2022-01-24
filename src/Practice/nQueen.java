package Practice;

public class nQueen {
    public static void main(String[] args) {
        int n = 8;
        int[][] board = new int[n][n];
        queenCombi(board , 0 , n);
    }

    private static void queenCombi(int[][] board, int cr, int n) {
        if (cr==n)
        {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 1)
                        System.out.print("True" + " ");
                    else
                        System.out.print("False" + " ");
                }
                System.out.println();
            }
            System.out.println("**************************");
            return;
        }
        for (int cc = 0 ; cc<n;cc++)
        {
            if(kyaQueenRakkhu(board,cr,cc,n))
            {
                board[cr][cc] = 1;
                queenCombi(board,cr+1,n);
                board[cr][cc] = 0;
            }
        }
    }

    private static boolean kyaQueenRakkhu(int[][] board, int cr, int cc, int n) {
//

//        for (int row =0;row<cr;row++)
//        {
//            if (board[row][cc]==1)
//                return false;
//        }
//        int row = cr;
//        int col = cc;
//
//        while (row>=0 && col>=0)
//        {
//            if (board[row][col] == 1)
//                return false;
//            row--;
//            col--;
//
//        }
//        row = cr;
//        col = cc;
//
//        while (row>=0 && col< n)
//        {
//            if (board[row][col] == 1)
//                return false;
//            row--;
//            col++;
//
//        }
//        return true;


//        2.

//        for (int row = 0;row<cr;row++)
//        {
//            if (board[row][cr]==1)
//                return false;
//        }
//
//        //for right diagnol
//        int row =cr;
//        int col = cc;
//        while(row>=0 && col>=0)
//        {
//            if (board[row][col] == 1)
//                return  false;
//            row--;
//            col--;
//        }
//
//
//        //for left diagol
//        row = cr;
//        col = cc;
//
//        while (row>=0 && col< n)
//        {
//            if (board[row][col] == 1)
//                return false;
//            row--;
//            col++;
//
//        }
//        return true;


        for (int row = 0;row<cr;row++)
        {
            if (board[row][cc]==1 )
                return false;
        }

        int row =cr;
        int col = cc;

        while (row>=0 && col >=0)
        {
            if (board[row][col] == 1)
                return false;
            row--;
            col--;
        }

        row =cr;
        col = cc;

        while(row>=0 && col <n)
        {
            if(board[row][col] == 1)
                return false;
            row--;
            col++;
        }
        return true;
    }
}
