public class binarySearch {


    public static void main(String[] args) {

        System.out.println(binaryS(new int[]{1,2,3,4,5,6,7,8},0,6,5));
    }

    private static int binaryS(int[] arr, int start, int end, int target) {
        if (start>end){
            return -1;
        }
        int mid = (start + end) / 2;
        //base case
        if (arr[mid] == target) {
            return mid;

        }
        if(target<arr[mid])
        {
            end=mid-1;
            return binaryS(arr, start, end, target);
        }
        start=mid+1;
        return binaryS(arr, start, end, target);

    }

}
