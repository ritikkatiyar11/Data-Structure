public class sumInRange {
    public static int fun(int n,int m ){
        int total=0;
        int sum=0;
        for (int i = 1; i < m+1; i++) {

            if(i%n==0){
                sum+=i;
            }
            else {
                total+=i;
            }

        }
        return total-sum>0? total-sum:sum-total;

    }

    public static void main(String[] args) {
        System.out.println(fun(2,4));
    }
}
