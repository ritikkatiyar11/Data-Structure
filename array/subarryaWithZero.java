import java.util.ArrayList;
import java.util.HashMap;

public class subarryaWithZero {
    public static void main(String[] args) {
        int arr[]={1,3,2,-1,5};
        System.out.println(algorithm(arr));
    }
    public static  boolean algorithm(int arr[]){
        int currSum=0;
        int target=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];
            if(currSum==target){
                return true;
            }
            if(map.containsKey(currSum-target))
            {
                return  true;
            }
            map.put(currSum,i);
            

        }
        return  false;







    }
}
