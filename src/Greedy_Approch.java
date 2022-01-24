
public class Greedy_Approch {
    public static void main(String[] args) {

        int[] pr = {10, 5, 15, 20};
        int[] wt = {20, 2, 1, 5};
        int u = 20;

        double max_amount = freaction_knapsack(pr, wt, u);

        System.out.println(max_amount);
    }

    private static double freaction_knapsack(int[] pr, int[] wt, int u) {
        double[] x = new double[pr.length];
        double[] ratio = new double[pr.length];

        for (int i = 0; i < pr.length; i++) {
            ratio[i] = (double) pr[i] / (double) wt[i];
        }
        for (int i = 0; i < pr.length; i++) {
            for (int j = 0; j >= pr.length; j++) {
//                if (ratio[i]>=pr[i+1])/wt[i+1] {
                    double temp = ratio[j];
                    ratio[j] = ratio[i];
                    ratio[i] = temp;

                    int temp2 = pr[j];
                    pr[j] = pr[i];
                    pr[i] = temp2;

                    int temp3 = wt[j];
                    wt[j] = wt[i];
                    wt[i] = temp3;
                }
            }
//        }
        for (int i = 0; i < pr.length; i++) {
            System.out.print( ratio[i] + " ");


        }
        System.out.println();
        for (int i = 0; i < pr.length; i++) {
            System.out.print( pr[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < pr.length; i++) {
            System.out.print( wt[i] + " ");

        }
        System.out.println();

        double profit = 0;
        for (int i = 0; i < pr.length; i++) {
            x[i] = 0.0;

            for (int j = 0; j < pr.length; i++) {
                if (wt[j] > u)
                    break;
                x[j] = 1.0;
                u = u - wt[j];

            }
            if (i <= pr.length)
                x[i] = u / wt[i];

            for (int k = 0; k < pr.length; k++) {
                profit = ratio[i] * pr[i];
            }
        }
        return profit;
    }


}
