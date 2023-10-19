
import java.util.*;
public class subArray {
    public static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int x : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(x);
                outer.add(internal);


            }
        }
        return outer;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans=subset(new int[]{1,2,3});
        for (List<Integer>  x:ans
             ) {
            System.out.print(x+" ");

        }
    }

}

