package Extra;

public class Josephus_Problem {
    public static void main(String[] args) {


    int n = 5;
    int k = 3;

        System.out.println(josephus_Solution(n, k));
}

    private static int josephus_Solution(int n, int k) {
        if (n==1);
        return 0;
//        int i = (josephus_Solution(n - 1, k) + k) % n;
//        return i;
    }
}
