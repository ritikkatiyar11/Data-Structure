import java.util.Arrays;

class quicksort{
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int  partition(int arr[],int low,int high)
    {
        int pivot;
        int i=low,j=high;
        int mid=(i+j)/2;
        pivot = arr[mid];
        while(i<j)
        {
            while (arr[i]<=pivot){ i++; }
            while (arr[j]>pivot){j--; }
            if (i<j)
            {
                swap(arr,i,j);
            }

        }
        swap(arr,mid,j);
        System.out.println(Arrays.toString(arr));
        return  j;

    }
    public static void sort(int arr[],int low,int high){
        if (low<high){
            int pi=partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}