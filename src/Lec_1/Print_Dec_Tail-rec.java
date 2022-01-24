package Lec_1;

//Tail Recursion ==> function call is in last sattemtn in compersion to sout.......



class Print_Dec {
    public static void main(String[] args) {
        int n = 5;
        printdec(n);
    }

    private static void printdec(int n) {
        if (n<1)
            return;
        System.out.println(n);
        printdec(n-1);

    }
}
