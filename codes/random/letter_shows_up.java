import java.util.*;

public class letter_shows_up {
    public static String fun(String s)
    {
        HashMap<Character ,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)

        {
            char ch=s.charAt(i);
            if(h.containsKey(ch)){

                int value=h.get(ch)+1;
                h.put(ch,value);

            }
            else {
                h.put(ch,1);

            }
        }
        String result="";
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(i!=s.length()-1){
            result=result+" "+ch+" : "+String.join("", Collections.nCopies(h.get(ch), "$"))+",";}
            else {
                result=result+" "+ch+" : "+String.join("", Collections.nCopies(h.get(ch), "$"));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fun("aaabc"));
    }

}
