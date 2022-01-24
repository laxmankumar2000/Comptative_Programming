package Practice;

public class lengthOfString {
    public static void main(String[] args) {
        String  str = "laxman";
        System.out.println(legthsStr(str));
//        legthsStr(str,str.length());
    }

    public static int legthsStr(String str) {
        if (str.isEmpty())
            return 0;
        String st = str.substring(1);
        int res = legthsStr(st);
        int total = res+1;
        return total;

    }
}
