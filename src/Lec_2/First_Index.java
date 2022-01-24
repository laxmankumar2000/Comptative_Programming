package Lec_2;

public class First_Index {
    public static void main(String[] args) {


        int[] arr = {10, 20, 5, 30, 80, 1, 4, 5, 14, 50};
        int key = 50;
        System.out.println(firstIndex(arr, 0, key));
    }

    private static int firstIndex(int[] arr, int i, int key) {

        if (i>arr.length-1)
            return -1;
        if (arr[i] == key){
            return i;

        }
        return firstIndex(arr,i+1,key);
    }
}