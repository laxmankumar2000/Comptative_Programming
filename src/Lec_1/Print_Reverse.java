package Lec_1;

public class Print_Reverse {
    public static void main(String[] args) {

        String str = "laxman";
        reverStr(str);
        System.out.println();
        reverStr1(str);
    }

//    using the concept of tail recursion
    private static void reverStr(String st) {

        if (st.length()==0)
            return;

        reverStr(st.substring(1));
        System.out.println(st.charAt(0));

    }

//    using the concept of  method of String
    private static void reverStr1(String st) {

        if (st.length()==0)
            return;

        System.out.println("before "+st.charAt(st.length()-1));
        reverStr1(st.substring(0,st.length()-1));
        System.out.println( " Sfter "+st.charAt(st.length()-1));



    }
}
