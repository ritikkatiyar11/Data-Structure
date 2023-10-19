public class issortedArray {
    public static boolean helper(int arr[],int i,int n){
        if(arr[i]>arr[i+1])
        {
            return  false;

        }
        if(i==n-2){
            return true;
        }
        return helper(arr, i+1, n);
    }

    public static void main(String[] args) {
        int arr[]={1,2,1,4,5};
        int n=5;
        System.out.println(helper(arr,0,5));

    }

}
