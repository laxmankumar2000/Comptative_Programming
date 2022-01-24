package Lec_12;

import java.util.List;

public class Triangle_leetcode {
    public static void main(String[] args) {

    }
    public int minimumTotalRec(List<List<Integer>> triangle, int cr, int cc)
    {
        if (cr == triangle.size()-1)
            return triangle.get(cr).get(cc);

        int c1 = minimumTotalRec(triangle,cr+1,cc);
        int c2 = minimumTotalRec(triangle,cr+1,cc+1);
        return Math.min(c1,c2)+triangle.get(cr).get(cc);
    }
}
