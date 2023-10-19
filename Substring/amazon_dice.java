import java.util.*;
public class amazon_dice {
    public static void dice(String p,int target)
    {
        if (target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 &&  i<=target; i++) {
            dice(p+i, target-i);
            
        }
    }

    public static List<String> dicereturn(String p,int target)
    {
        if (target==0){
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans=new ArrayList<>();
        for (int i = 1; i <=6 &&  i<=target; i++) {
            ans.addAll(dicereturn(p+i, target-i));

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(dicereturn("",4));
    }
}
