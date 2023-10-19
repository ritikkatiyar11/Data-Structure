public class minimumPenalty {
    public static int penalty(int []arr)
    {
        int n= arr.length;
        int sum=0;
        for(int i=1;i<n;i++)
        {
            sum=sum+(arr[i]-arr[i-1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={-2,1,4,6};
        System.out.println(penalty(arr));
    }
}
