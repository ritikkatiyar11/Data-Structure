/**
 * max_array
 */

public class max_array {

    public static int arrmax(int [] arr,int n)
    {
        if (n==1)
        {
            return arr[0];
        }



        
        return Math.max(arr[n-1],arrmax(arr,n-1));



    }
    public static void main(String[] args) {
        int list[]={1,2,3,4};
        System.out.println(arrmax(list, 4));
    }
}