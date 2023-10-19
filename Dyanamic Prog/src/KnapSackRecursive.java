public class KnapSackRecursive {
    public static void main(String[] args) {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapsack(weight,profit,W,n));

    }
    public  static int knapsack(int []weight,int []value,int capacity,int n){
        if(n==0||capacity==0){
            return 0;

        }
        if(weight[n-1]<=capacity){
            return Math.max(knapsack(weight, value, capacity, n-1),value[n-1]+knapsack(weight, value, capacity-weight[n-1], n-1));
        }
        else {
            return knapsack(weight, value, capacity, n-1);
        }
    }
}
