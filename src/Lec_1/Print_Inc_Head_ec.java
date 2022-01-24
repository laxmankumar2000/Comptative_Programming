package Lec_1;

//Head Recusrion --- in this recursion the recursive call is before the printstatement .....
public class Print_Inc_Head_ec {
    public static void main(String[] args) {
        printINC(5);
    }

    private static void printINC(int i) {
        if (i<1)
            return;
        printINC(i-1);
        System.out.println(i);
    }
}
