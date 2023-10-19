import java.util.HashMap;

public class pass {
    public static int maxcount(HashMap<Integer,Integer>map){
        
    }
    public static int num(int []arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }

    }
}
