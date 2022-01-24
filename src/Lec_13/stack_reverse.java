package Lec_13;

import java.util.Stack;

public class stack_reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        reve(st);
        System.out.println(st);
    }
    static void reve(Stack<Integer> st)
    {
        if (st.isEmpty())

            return;
        int val = st.pop();
        reve(st);
        insert(st,val);
    }

    static void insert(Stack<Integer> st, int val)
    {
        if(st.isEmpty())
        {
            st.add(val);
            return;
        }
        int num = st.pop();
        insert(st,val);
        st.push(num);
    }

}
