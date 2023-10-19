import java.util.Stack;

public class revstr {
    public static String rev(String s){
        if(s.length()<1){
            return "";
        }
        return  s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));
    }

    public static void main(String[] args) {
        String s="...ritik is a good boy..";
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            stk.push(s.charAt(i));
        }
        String out="";
        for (int i = 0; !stk.isEmpty(); i++) {
            out=out+stk.pop();

        }
        System.out.println(out);

    }
}
