package Lec_13;

public class stock_span {
    public static void main(String[] args) {
        int[] arr = { 30, 31, 15, 32, 24, 11 };                  //1,2,1,4,1,1

        stoke_span_pblm(arr,arr.length);
    }
    static  void stoke_span_pblm(int[] arr,int n)
    {
        int[] nav = new int[n];
        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int j = i-1; j >=0 ; j--) {
                if (arr[i]>arr[j])
                    val++;
                else
                    break;

            }
            nav[i] = val;
        }

        for (int i:nav)
        {
            System.out.print(i+" ");
        }
    }
}
