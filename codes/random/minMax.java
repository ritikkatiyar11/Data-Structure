import java.util.Arrays;

public class minMax {
    public static int count(int[] arr,int [] b,int k){
        Arrays.sort(b);
        int low=0,high=0;
        for (int x:arr){
            if(x>k){
                high++;

            }

        }
        for (int x:b){
            if(x<k){
                low++;

            }

        }
        
        return Math.max(low,high);
    }


}



