import java.util.Arrays;

public class tripleSum {
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        //2 2 3 3

        Arrays.sort(arr);
        int sum=6;
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i]!=arr[i+1]||i==0) {


                int b = i + 1;
                int c = arr.length - 1;
                while (b < c) {
                    if ((arr[b] + arr[c]) == sum - arr[i]) {
//                        System.out.println();
                        count++;
                        while (b < c && arr[b] == arr[b + 1]) {
                            b++;
                        }
                        while (b < c && arr[c] == arr[c - 1]) {
                            c--;
                        }
                        b++;
                        c--;
                    }
                    if ((arr[b] + arr[c]) > sum-arr[i]) {
                        c--;
                    }
                    if ((arr[b] + arr[c]) < sum-arr[i]) {
                        b++;
                    }
                }


            }
        }
        System.out.println(count);
    }
}
