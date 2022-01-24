
/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.



Example 1:


Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
Example 2:

Input: grid = [[1,2,3],[4,5,6]]
Output: 12


Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 200
0 <= grid[i][j] <= 100

 */
package Lec_11;
import java.util.Scanner;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(Sol(grid,3,0,0));
        Scanner sc = new Scanner(System.in);
//        long a = sc.nextLong();


    }

    private static int Sol(int[][] grid, int n, int row, int col) {

        if(row==grid.length || col==grid[0].length )
            return Integer.MAX_VALUE;
        if(row== grid.length-1 && col== grid[0].length-1)
            return grid[row][col];

        int ans = 0;
        int down = Sol(grid,n,row+1,col);
        int right = Sol(grid,n,row,col+1);
        return Math.min(down,right) + grid[row][col];

    }
}
