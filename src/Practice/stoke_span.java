package Practice;

public class stoke_span {
    public static void main(String[] args) {
        //
        int[] arr = { 30, 31, 15, 32, 24, 11 };

        stockspan(arr);

    }

//    static void stockspan(int[] arr)
//    {
//        int[] nav = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            int val = 1;
//            for (int j = i-1; j >=0 ; j--) {
//                if (arr[i]>arr[j])
//                    val++;
//            }
//            nav[i] = val;
//
//        }
//        for (int i:nav
//             ) {
//            System.out.println(i);
//        }
//    }
    private static void stockspan(int[] arr) {
        //

        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {

            int c = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    c++;
                } else {
                    break;
                }

            }
            ans[i] = c;

        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

    }
}
