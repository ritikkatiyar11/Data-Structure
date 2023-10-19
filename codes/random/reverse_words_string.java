import java.util.Arrays;
import java.util.Stack;

public class reverse_words_string {
    public static void main(String[] args) {
        String s=" welcome to ritik ";
        String temp[]=s.strip().split(" ");
        System.out.println(Arrays.toString(temp));
        Stack<String> stk=new Stack<>();
        for (int i = 0; i < temp.length; i++) {
            stk.push(temp[i]);

        }
//        while(!stk.isEmpty()){
////            System.out.print(stk.pop());
//        }

        System.out.println(String.join(".",temp));







    }
}
