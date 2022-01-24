package Lec_14;

import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        int[] arr = { 11, 9, 13, 21, 3 };                   // 13,13,21,-1,-1
        nextgraterElementBru(arr,arr.length);
        nextgraterElementST(arr,arr.length);
    }
    static void nextgraterElementBru(int[] arr,int n)
    {
        int[] res = new int[n];
        for (int i=0;i<n;i++)
        {
            int val = -1;
            for (int j=i+1;j<n;j++)
            {
                if (arr[i]<arr[j])
                {
                    val =arr[j];
                    break;
                }

            }
            res[i]=val;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i] +" == " + res[i]);
        }
    }

    static  void nextgraterElementST(int[] arr, int n)
    {
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()])
            {
                res[st.pop()]=arr[i];
            }

            st.push(i);
        }
        while(!st.isEmpty())
        {
            res[st.pop()]=-1;
        }
        for(int i:res)
        {
            System.out.println(i);
        }
    }


}
