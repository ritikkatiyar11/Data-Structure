import java.util.Arrays;
import java.util.HashMap;

public class subArrayGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 7, 10, 10, 8, 10};
        System.out.println(Arrays.toString(find(arr,10)));
    }
    public static int[]find(int[] arr,int sum){
        HashMap<Integer,Integer>map=new HashMap<>();
        int currSum=0;
        int start=0;
        int end=-1;
        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];
            if(currSum==sum){
                return  new int[]{start,i};
            }
            if(map.containsKey(currSum-sum)){
                start=map.get(currSum-sum)+1;
                end=i;
                return new int[]{start,end};

            }
            map.put(currSum,i);
        }
        return new int[]{-1};
    }
}
