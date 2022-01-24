package Lec_1;

import java.util.*;

public class Fact {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. that find the factorial");
        int n = sc.nextInt();

        System.out.println(fact(n));
//        fact1(25)
    }

    public static  int fact(int n)
    {
        if (n==1)
        return 1;
        return n*fact(n-1);

    }



//    public static  void fact(int n)
//    {
//        if (n<1)
//            return ;
//
//        System.out.println(n*fact(n-1););
//    }
}
