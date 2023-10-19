public class jumpGame {
    public static int jumps(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            return jumps(n/2,count+1);
        }
        else{
            return jumps(n-1,count+1);

        }
    }

    public static void main(String[] args) {
        System.out.println(jumps(10,0));
    }
}
