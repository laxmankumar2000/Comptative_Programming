package Lec_5;

public class Demo_BackTracking {

    public static void main(String[] args) {
        int[] arr = new int[6];
        print(arr,0);
        for (int i :arr
             ) {
            System.out.println(i);

        }
    }

    private static void print(int[] arr, int i) {
        if (i==arr.length)
            return;
        arr[i] = 10;
        print(arr,i+1);
        arr[i] = 0;
    }
}
