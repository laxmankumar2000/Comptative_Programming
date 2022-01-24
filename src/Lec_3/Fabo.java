package Lec_3;

public class Fabo {
    public static void main(String[] args) {

        int n = 5;

        System.out.println(fabonacci(n));
    }

    private static int fabonacci(int n) {

        if (n==0||n==1)
            return n;
        int fa1=fabonacci(n-1);
        int fa2=fabonacci(n-2);
        return fa1+fa2;

    }
}
