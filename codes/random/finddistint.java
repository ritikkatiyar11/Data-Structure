import java.util.HashMap;

public class finddistint {
    public static  int demo(int []arr){
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(!map.containsKey(x)){
                count++;
            }
            map.put(x,1);
        }
        return  count;

    }

    public static void main(String[] args) {
        System.out.println(demo(new int []{1,2,3,4}));
    }
}
