public class chechPalindome {
    public static boolean check(String str){
         int val=str.compareTo( new StringBuilder(str).reverse().toString());
         return val==0?true:false;
    }

    public static void main(String[] args) {
        System.out.println(check("aba"));
    }
}
