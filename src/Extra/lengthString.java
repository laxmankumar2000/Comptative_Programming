package Extra;

public class lengthString {
    static int length(String str)
    {
        if(str.isEmpty())
            return 0;
        String bachikuchi = str.substring(1);
        int res = length(bachikuchi);
        int total = res + 1;

        return  total;
    }

    public static void main(String[] args) {
        String str = "LAxman";
        System.out.println(length(str));
    }
}
