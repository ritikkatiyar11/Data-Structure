import java.util.ArrayList;
import java.util.List;

public class permutationsOfArray {
    public static List<List<Integer>> permutations(int []arr){

        boolean []map=new boolean[arr.length];
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        helper(arr,ans,ds,map);
        return ans;

    }

    public static void helper(int[] arr, List<List<Integer>> ans, List<Integer> ds, boolean[] map) {
        //base
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!map[i]){
                map[i]=true;
                ds.add(arr[i]);
                helper(arr, ans, ds, map);
                ds.remove(ds.size()-1);
                map[i]=false;
            }
        }


    }


    public static void main(String[] args) {
        List<List<Integer>> result=permutations(new int []{1,2,3});
        for (List<Integer> x:result){
            System.out.println(x);
        }



    }
}
