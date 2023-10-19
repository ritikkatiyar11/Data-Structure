import java.util.ArrayList;
import java.util.Arrays;

public class stringsub {
    public static ArrayList<int[]> permute(int[] arr) {
        ArrayList<int[]> res = new ArrayList<>();
        helper(res, arr, 0, arr.length-1);
        return res;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void helper(ArrayList<int[]> res, int arr[], int low, int high) {
        if (low == high) {
            res.add(Arrays.copyOf(arr, arr.length));
            return ;
        }
        for (int i = low; i <= high; i++) {
            swap(arr, low, i);
            helper(res, arr, low+ 1, high);
            swap(arr, low, i);

        }


    }
    public static void main(String[] args)
    {
        int[] nums = { 1,2,3};
        ArrayList<int[]> res = permute(nums);
        // printing result
        for (int[] x : res) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
