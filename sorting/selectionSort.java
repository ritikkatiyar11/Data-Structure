import java.util.Arrays;

public class selectionSort extends quicksort {

    public static void main(String[] args) {
        int arr[]={3,2,5,67,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int arr[])
    {   int idx=-1;
        for (int i = 0; i < arr.length; i++) {
            idx=i;
            for (int j = i+1; j <arr.length; j++) {
                if (arr[idx]>arr[j])
                {
                    idx=j;
                }


            }
            swap(arr,idx,i);



        }
    }
}
