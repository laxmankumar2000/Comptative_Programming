package Lec_3;

import java.util.*;
import java.util.HashSet;

public class Climbing_Stairs {
    public static int numberOfWays(int curr , int dis)
    {
        if(curr>dis)
        return 0;
        if(curr==dis)
            return 1;
        int st1 = numberOfWays(curr+1,dis);
       int st2 =  numberOfWays(curr+2,dis);
        return st1+st2;
    }

    public static void numberOfWaysprint(int curr , int dis , String ans)
    {
//        ArrayList<Integer> al = new ArrayList<>();

        if(curr>dis) {
//            al.add(0);
            return;
        }
        if(curr==dis) {

//            al.add(1);
            System.out.println(ans);
            return;
        }
         numberOfWaysprint(curr+1,dis , ans+1);
        numberOfWaysprint(curr+2,dis , ans+2);
//        return st1+st2;
    }
    public static void main(String[] args) {

        int m=4;
        System.out.println(numberOfWays(0,8));
        numberOfWaysprint(0,4, " ");

        Set<Integer> st = new LinkedHashSet<>();
        st.add(1);
        st.add(10);
        st.add(2);
        System.out.println(st);

    }
}
