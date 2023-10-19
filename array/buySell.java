class buySell{
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(minSoFarMethod(arr));
    }
    public static int minSoFarMethod(int arr[]){
        int profit=0;
        int minsofar=arr[0];
        for(int x:arr){
            minsofar=Math.min(minsofar,x);
            profit=Math.max(profit,(x-minsofar));
        }
        return profit;
    }
    public static int min(int[] arr,int i,int j){
        int min =9999;
        for(int k=i;k<j;k++){
            if(min>arr[k])
            {
                min=arr[k];
            }


        }
        return min;
    }public static int max(int[] arr,int i,int j){
        int min =0;
        for(int k=i;k<j;k++){
            if(arr[k]>min)
            {
                min=arr[k];
            }


        }
        return min;
    }
    public static int  profit(int arr[]){
        int profit=0;
        for (int i = 0; i < arr.length; i++) {
            int buy=min(arr,0,i);
            int sell =max(arr,i,arr.length);
            profit=Math.max(profit,(sell-buy));

        }
        return profit;
    }
}