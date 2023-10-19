import java.util.*;
public class numpad {
    public static void pad(String p,String up)
    {
        if (up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
        char ch= (char) ('a'+i);
        pad(p+ch,up.substring(1));
        }
    }

    public static List<String> padd(String p,String up)
    {
        if (up.isEmpty())
        {   List<String> result=new ArrayList<>();

            result.add(p);
            return result;
        }
        int digit=up.charAt(0)-'0';
        List<String> ans=new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch= (char) ('a'+i);
           ans.addAll( padd(p+ch,up.substring(1)));

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(padd("","12"));
    }


}
