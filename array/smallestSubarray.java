public class smallestSubarray {
    public static void main(String[] args) {

        int arr[] = {1, 3, 4, 7, 10, 10, 8, 10};
        int x = 10; // Change x to the desired value
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum >= x) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println("No subarray found");
        } else {
            System.out.println(minLen);
        }
    }
}




