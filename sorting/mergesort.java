import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
    int arr[]={4,3,2,67,6};
        System.out.println(Arrays.toString(sort(arr)));


    }
    public static int [] sort(int[] arr){
       if(arr.length==1){
           return arr;
       }
       int mid =arr.length/2;
       int []left=sort(Arrays.copyOfRange(arr,0,mid));
       int right[]=sort(Arrays.copyOfRange(arr,mid,arr.length));
       return merge(left,right);

    }
    public static int []merge(int[]left,int []right)
    {
        int i=0;int j=0;int k=0;
        int []res=new int[left.length+right.length];

        while(i<left.length && j<right.length){
            if(left[i]>right[j])
            {
                res[k]=right[j];
                j++;

            }
            else {
                res[k]=left[i];i++;

            }
            k++;
        }
        while (i<left.length)
        {
            res[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length)
        {
            res[k]=right[j];
            j++;
            k++;
        }
        return res;

    }


}
