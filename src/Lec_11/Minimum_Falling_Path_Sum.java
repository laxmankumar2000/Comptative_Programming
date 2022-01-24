/*
Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.

A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right.
Specifically, the next element from position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).



Example 1:


Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
Output: 13
Explanation: There are two falling paths with a minimum sum as shown.
Example 2:


Input: matrix = [[-19,57],[-40,-5]]
Output: -59
Explanation: The falling path with a minimum sum is shown.
 */
package Lec_11;

public class Minimum_Falling_Path_Sum {
    public static void main(String[] args) {
        int[][] grid = {{2,1,3},{6,5,4},{7,8,9}};
        int res = Integer.MAX_VALUE, ans=0;
        for(int i=0;i<grid[0].length;i++)
        {
            ans = minimumPathSum1(grid,0,i);

            res = Math.min(res,ans);
        }
        System.out.println(res);
    }
    static int minimumPathSum1(int[][] grid, int cr,int cc)
    {
        if (cr==grid.length || cc<0 || cc==grid[0].length)
            return  Integer.MAX_VALUE;
        if (cr==grid.length-1)
            return  grid[cr][cc];
        int way1 = minimumPathSum1(grid,cr+1,cc-1);
        int way2 = minimumPathSum1(grid,cr+1,cc);
        int way3 = minimumPathSum1(grid,cr+1,cc+1);

        return Math.min(way1,Math.min(way2,way3)) + grid[cr][cc];

    }
}
