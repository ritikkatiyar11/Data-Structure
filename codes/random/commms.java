public class commms {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int brr[]={3,4,5};
        int crr[]={7,8,3};
        int i=0,j=0,k=0;
        while(i<3&&j<3&&k<3){
            if( arr[i]==brr[j]&&brr[j]==crr[k]){
                System.out.println(arr[i]);
                i++;j++;k++;

            }
            if(arr[i]<brr[j]&&brr[j]<crr[k]){
                i++;
            }
            if(brr[j]<arr[i]&&brr[j]<crr[k]){

                j++;
            }
            else {
                k++;
            }
        }

    }
}
