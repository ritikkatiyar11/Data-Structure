import java.util.Arrays;

public class quicksort1 {
    public static void main(String[] args) {
        int arr[]={3,2,5,67,9};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int arr[],int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void  sort(int []arr,int low,int high)
    {
        if(low<high){

            int pi=partion( arr,low,high);
            {
                sort(arr,low,pi-1);
                sort(arr,pi+1,high);
            }
        }
    }
    public static int partion(int[] arr,int low,int high){
        int pivot =arr[low];
        int i=low;
        int j=high;
        while(i<j){

            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            if(i<j)
            {
                swap(arr,i,j);
            }


        }
        swap(arr,low,j);
        return j;
    }


}
