package Extra;

public class Palidrome_String {
    public static void main(String[] args) {
        String str ="abcdcba";

        System.out.println(palidrome(str,0,str.length()-1));


    }

    private static boolean palidrome(String str, int lb, int ub) {
        if (lb>=ub)//even string elength
            return true;
        if (str.charAt(lb)!=str.charAt(ub))
            return false;
//        if ()
        return palidrome(str,lb+1,ub-1);
    }
}
