public class topDownKnapSack {
    public static void main(String[] args) {

        int values[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int w = 50;
        int n=values.length;
        int t[][]=new int[n+1][n+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < n+1; j++) {
                t[i][j]=0;

            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if(weight[i-1]<=w){
//                    t[i][j]=Math.max()
                }

            }
        }

    }
}
