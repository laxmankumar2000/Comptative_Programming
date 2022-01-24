package Extra;

public class ReachDestination {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;

        System.out.println(findMaxPath(row,col));
        findMaxPath1(row,col,"");
    }

    private static int findMaxPath(int row, int col) {

        if(row ==1 || col==1)
            return 1;

        return findMaxPath(row-1,col)+ findMaxPath(row,col-1);
    }
    private static void findMaxPath1(int row, int col,String ans) {

        if(row ==1 || col==1)
        {
            System.out.println(ans);
            return;
        }
//            return 1;

        findMaxPath1(row-1,col , ans+"H");
        findMaxPath1(row,col-1,ans+"V");
    }
}
