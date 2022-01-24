package Lec_3;

public class Last_Index {
    public static void main(String[] args) {


        int[] arr = {10, 20, 40, 50, 10, 20, 30, 50, 70};

        int key = 70;
        System.out.println(lastIndex(arr, arr.length - 1, key));

    }

    private static int lastIndex(int[] arr, int i, int key) {
       if (i<0)
           return -1;
        if(arr[i] == key)
            return i;
        return lastIndex(arr,i-1,key);

    }
}