package loveBabbar;

class move_negative_array{
    
    public void segregateElements(int arr[], int n)
    {
        int[] A = new int[n];  
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                A[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                A[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++)
            arr[i] = A[i];
    }
}


