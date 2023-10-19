public class Palindrome {
    static boolean isPalindrom(String str) {
        if (str.length() == 0 || str.length() == 1){
        return true;
        } else {
        if (str.charAt(0) != str.charAt(str.length() - 1)){
        return false;
        } else {
        return isPalindrom(str.substring(1, str.length()-1));
        }
        }
        }
    public static void main(String[] args) {
        String s="abccba";
        System.out.println(isPalindrom((s)));
        
    }
}
