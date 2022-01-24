package Lec_4;

public class subSequncess {
    public static void main(String[] args) {
        String str = "abc";

        subSequnces(str,"" ,0);
        sol2(str,"");


    }



    private static void subSequnces(String str, String ans , int i) {
        if (i==str.length()) {
            System.out.println(ans);
            return;
        }
        subSequnces(str,ans+ str.charAt(i) ,i+1);
        subSequnces(str,ans,i+1);
    }

    private static void sol2(String str, String ans) {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        Character ch = str.charAt(0);
        sol2(str.substring(1),ans+ch);
        sol2(str.substring(1),ans);
    }
}
