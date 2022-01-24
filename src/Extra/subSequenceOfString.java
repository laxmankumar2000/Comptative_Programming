package Extra;

import java.util.ArrayList;

public class subSequenceOfString {
    public static void main(String[] args) {
        String str = "abc";
        sequence(str,"",0);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);

//        System.out.println(al.contains(2));
    }

    private static void sequence(String str, String ans , int i) {
        if(i==str.length()) {
            System.out.println(ans);
            return;
        }
        sequence(str,ans,i+1);
        sequence(str,ans+str.charAt(i),i+1);


    }

//    private static void sequence(String str, String s) {
//    }
}
