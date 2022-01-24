package Practice;

public class subSwequences {
    public static void main(String[] args) {
        String str = "abc";
        subSequence(str,"",0);
    }

    private static void subSequence(String str, String ans, int i) {
        if(i>=str.length())
        {
            System.out.println(ans);
            return;
        }

        subSequence(str,ans+str.charAt(i),i+1);
        subSequence(str,ans,i+1);
    }
}
