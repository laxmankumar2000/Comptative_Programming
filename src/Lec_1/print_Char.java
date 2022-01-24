package Lec_1;

import java.util.Scanner;

public class print_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        str = sc.nextLine();
        printChar(str);


    }
    public static void printChar(String st)
    {
        if(st.length()==0)
            return;
        System.out.println(st.charAt(0));
        printChar(st.substring(1));
    }
}
