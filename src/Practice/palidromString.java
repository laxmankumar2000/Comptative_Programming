package Practice;

public class palidromString {
    public static void main(String[] args) {
        String str =  "racecar";

        System.out.println(isPalidrom(str, 0 , str.length()-1));

    }

    private static boolean isPalidrom(String str, int i ,int u) {

//        if(i==u)
//            return true;
        if (i>u)
            return false;


        if (str.charAt(i) != str.charAt(u))
            return false;
        return isPalidrom(str,i+1 , u-1);


    }
}
