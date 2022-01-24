package Lec_12;

import java.util.ArrayList;
import java.util.List;

public class Two_ArayList {

    public static void main(String[] args) {
        ArrayList<Integer> al2 = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();


        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            {
                ArrayList<Integer> al = new ArrayList<>();
                al.add((i+1)*10);
                al.add((i+1)*20);
                al.add((i+1)*30);
                al.add((i+1)*40);
                list.add(al);
            }

        }
//        System.out.println(list);


        for (int i =0;i<list.size();i++)
        {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) +  " ");

            }
            System.out.println();
        }
    }
}
