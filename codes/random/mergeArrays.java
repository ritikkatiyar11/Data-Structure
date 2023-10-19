import java.util.Arrays;

public class mergeArrays {
    public static void swap(int []a,int [] b,int i,int j){

        int temp=a[i];
        a[i]=b[j];
        b[j]=temp;
    }
    public static void main(String[] args) {
        int arr1[]={1,3,5,7} ; int arr2[]={0,2,6,8,9};

        int left= arr1.length-1;
        int right=0;
        while(left>=0 && right<arr2.length){

            if(arr1[left]>arr2[right]){
                swap(arr1,arr2,left,right);
                System.out.println("jhgf");
                left--;
                right++;

            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

}
