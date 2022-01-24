
/*

 */
package Lec_6;

import java.util.*;

public class KeyPad {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str =  sc.nextLine();


        //By  use of String
        KeyPadSol(str,"");


        //By ArrayList
        ArrayList<String> al = KeypadByArrayList(str);
        System.out.println(al);

    }

    static String[] tables = {"" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "xyz"};

    private static void KeyPadSol(String str, String ans) {
        if (ans.length()==0)
        {
            System.out.print(ans + "");
            return;
        }
        char ch = str.charAt(0);
        String keys = tables[ch-48];

        for (int i = 0;i<keys.length();i++)
        {
            KeyPadSol(str.substring(1),ans+keys.charAt(i));
        }
    }

    static  ArrayList<String> KeypadByArrayList(String str)
    {
        if (str.length() == 0)
        {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return  temp;
        }

        char ch = str.charAt(0);
        ArrayList<String> getstr = KeypadByArrayList(str.substring(1));

        ArrayList<String> ans = new ArrayList<>();

        String key = tables[ch-'0'];

        for(int i = 0;i<key.length(); i++)
        {
            for (String st :getstr)
            {
                ans.add(key.charAt(i) + st);
            }
        }


    return ans;

    }
}
