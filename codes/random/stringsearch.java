public class stringsearch {
    public static String fun(String str){
        char fnc=' ';
        for (char i : str.toCharArray()) {
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                fnc = i;
                break;
            }
        }
        return ""+fnc;
    }

    public static void main(String[] args) {
        System.out.println(fun("apple"));
    }
}
