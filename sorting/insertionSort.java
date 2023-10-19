import java.util.Arrays;

public class insertionSort extends  selectionSort{

    public static void main(String[] args) {
        int arr[]={3,2,5,67,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int arr[]){
        for (int i = 1; i <arr.length; i++) {
            int curr=arr[i];
                    int j=i-1;
            while(j>=0 && curr<arr[j] )
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;

        }
    }

}
