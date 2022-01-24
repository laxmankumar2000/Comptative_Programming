package Lec_6;

public class StringCompareTo {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hemlo";

        if (str1.compareTo(str2)>0)
            System.out.println("Yes");
        else if(str1.compareTo(str2)<0)
            System.out.println("No");
        else
            System.out.println("equal");

        System.out.println(str1.compareTo(str2));
    }
}
