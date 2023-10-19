public class maxProduct {
    public static void main(String[] args) {
        int []nums = {-2,0,-1};
        System.out.println(product(nums));

    }
    public static int product(int []arr){
        int curr=1;
        int max=-999;
        for (int i = 0; i < arr.length; i++) {
            curr*=arr[i];
            if(curr==0){curr=1;}
            if(curr>max){
            max=Math.max(curr,max);}
            else{
                curr=1;

            }


        }
        return max;
    }
}
