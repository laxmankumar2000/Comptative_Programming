package Practice;

public class sum {

    public static void main(String[] args) {
        int num = 4;
        int[] arr = {1,3,4};
        System.out.println(Sol(num,arr,0));
    }
    static  int Sol(int n, int[] arr , int i )
    {
        if (n==0)
            return 1;
        if (i==arr.length)
            return 0;
        int inc=0;
        int exc = 0;
        if (n>=arr[i])
            inc+= Sol(n-arr[i],arr,i+1);
        exc=Sol(n,arr,i+1);
        return inc+exc;
    }
}
