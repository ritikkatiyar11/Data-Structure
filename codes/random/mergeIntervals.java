import java.util.*;

class mergeIntervals {
    public static ArrayList<int[]> merge(int input[][]) {
        ArrayList<int[]> ans = new ArrayList<>();


        for (int i = 0; i < input.length; i++) {
            int start = input[i][0];
            int end = input[i][1];
//            if liesbefore
            

            if (!ans.isEmpty() && end <=ans.get(ans.size()-1)[1]) {
//                already covered
                continue;

            }

            for (int j = i + 1; j < input.length; j++) {
//
                if (end >= input[j][0]) {
                    end = Math.max(end, input[j][1]);

                } else {
                    break;
                }

            }
            ans.add(new int[]{start, end});


        }
        return  ans;
    }


    public static void main(String[] args) {
        int[][] input =
                {
                        {1, 3},
                        {2, 6},
                        {8, 10},
                        {15, 18}
                };
        Arrays.sort(input, (a, b) -> a[0] - b[0]);
//        for (int[] x : input) {
//            System.out.println(Arrays.toString(x));
//        }
        ArrayList<int []> out=merge(input);
        for (int[] x : out) {
            System.out.println(Arrays.toString(x));
        }


    }


}