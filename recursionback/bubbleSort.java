import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={2,4,3,17,8,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int []arr)
    {
        helper(arr,0);
    }
    public static void helper(int arr[],int index)
    {
        if (index==arr.length-1){
            return;
        }
        if (arr[index] > arr[index + 1]) {

            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }
        helper(arr, index+1);

    }

}
