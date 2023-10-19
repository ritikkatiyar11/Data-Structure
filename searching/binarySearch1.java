import java.util.Scanner;

public class binarySearch1 {
     
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []arr = {3,5,88,12,65,4,90,56};
    
    //sorting bubble:
    for(int j=0;j<arr.length-1;j++){
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]>arr[i+1]){
            swap(arr, i, i+1);
        }
    }}
    for(int x:arr){
        System.out.print(x+" ");

    }
    System.out.println();
    System.out.println("target");
    int target=sc.nextInt();
    int start=0,end=arr.length-1;

    while(start<=end){
        int mid=(start+end)/2;
        if(target==arr[mid]){
            System.out.println("found "+mid);
            break;
        }
        if(target>arr[mid])
        {
            start=mid+1;
        }
        if(target<arr[mid])
        {
            end=mid-1;
            
        }
    }

    }

    
   
    
    

}
