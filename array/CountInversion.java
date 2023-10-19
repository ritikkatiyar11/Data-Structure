public class CountInversion {
    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 1, 4};
        int temp[] = new int[arr.length];
        System.out.println(mergeSort(arr, temp, 0, arr.length - 1));
    }

    public static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;
            count += mergeSort(arr, temp, left, mid);
            count += mergeSort(arr, temp, mid + 1, right);
            count += merge(arr, temp, left, mid, right);
        }
        return count;
    }

    public static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left; // Index for the left subarray
        int j = mid + 1; // Index for the right subarray
        int k = left; // Index for the merged array
        int count = 0;

        while (i <= mid && j <= right) {
            if (arr[i] > arr[j]) {
                temp[k] = arr[j];
                count += mid - i + 1; // Increment count for inversions
                j++;
            } else {
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy merged elements back to the original array
        for (int index = left; index <= right; index++) {
            arr[index] = temp[index];
        }

        return count;
    }
}
