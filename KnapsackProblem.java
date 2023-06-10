class Knapsack {
    static int knapSack(int W, int wt[], int val[], int n) {
        if (n == 0 || W == 0)
            return 0;

        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);

        return Math.max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1),
                        knapSack(W, wt, val, n - 1));
    }

    public static void main(String args[]) {
        int profit[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;
        int n = profit.length;
        System.out.println(knapSack(W, weight, profit, n));
    }
}
