import java.lang.reflect.Array;
import java.util.Arrays;

public class diff {
        public static  int count(int diff,int []arr,int num){
            int res=0;
            Arrays.sort(arr);
            for(int x:arr){
                int val=num-x;
                if(Math.abs(val)<diff){
                    res++;
                }
                else {
                    break;
                }
            }
            return  res;
        }

    public static void main(String[] args) {
        System.out.println(count(2,new int[]{12,13,56,77,13},13));
    }

    }

