import java.util.Arrays;

class merge {
    public static int[] mergeArrays(int[] l, int[] r) {
        int i = 0, j = 0, k = 0;
        int ans[] = new int[l.length + r.length];
        while (i < l.length && j < r.length) {
            if (l[i] > r[j]) {
                ans[k] = r[j];
                j++;
            } else {
                ans[k] = l[i];
                i++;
            }
            k++;
        }
        while (i < l.length) {
            ans[k] = l[i];
            i++;
            k++;
        }
        while (j < r.length) {
            ans[k] = r[j];
            j++;
            k++;
        }
        return ans;


    }

    public static void mergeSort(int arr[]) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int left[] = new int[mid];
            int right[] = new int[arr.length - mid];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];

            }

            for (int i = 0; i < arr.length-mid; i++) {
                right[i] = arr[i+mid];

            }

            mergeSort(left);
            mergeSort(right);
            int ans[]=mergeArrays(left,right);


            for (int i = 0; i <ans.length ; i++) {
                arr[i]=ans[i];

            }
        }
        return;
    }

    public static void main(String[] args) {
        int arr[]={0,0,0,0};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
