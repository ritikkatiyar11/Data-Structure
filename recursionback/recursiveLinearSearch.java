import java.util.ArrayList;

public class recursiveLinearSearch {
    public static int search(int arr[],int index,int x){

        if(arr[index]==x){
            return index+1;
        }
        return search(arr,index+1 ,x);

    }
    public static ArrayList findall(ArrayList<Integer>out,int []arr,int target,int index){
        if(index==arr.length){
            return out;
        }
        if(arr[index]==target)
        {
            out.add(index);
        }
        return findall(out, arr, target, index+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,1,4,5};
        ArrayList<Integer> res= new ArrayList<>();
        ArrayList<Integer>finall=findall(res,arr,1,0);
        for (Integer x:finall)
        {
            System.out.println(x);
        }



    }

}
