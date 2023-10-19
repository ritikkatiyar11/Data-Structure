public class removeA {
    public static String fun(String up)
    {
        if (up.isEmpty())
        {
            return  "";
        }
        char ch=up.charAt(0);
        if (ch=='a')
        {
            return fun(up.substring(1));
        }
        return ch+fun(up.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(fun("baxxa"));
    }
}
