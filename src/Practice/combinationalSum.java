package Practice;

import java.util.ArrayList;

public class combinationalSum {
    public static  void main(String[] args) {
        int[] arr = {7,2,6,5};
        int n = 16;
        ArrayList<Integer> al = new ArrayList<>();
        combi(arr,n,0,"");
    }

    private static void combi(int[] arr, int n,int i,String ans) {
        if(i==arr.length-1)
            System.out.println(ans);
        combi(arr,n,i+1,ans+arr[i]);
        combi(arr,n,i,ans);


    }
}
