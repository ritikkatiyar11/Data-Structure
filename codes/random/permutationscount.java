public class permutationscount {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int count(String s)
    {
        int count[] = new int[26];
        int result=factorial(s.length());
        for (int i = 0; i < s.length(); i++) {

            count[(s.charAt(i) - 'a')]++;

        }
        for (int i = 0; i < 26; i++) {
            if(count[i]>1)
            {
                result=result/factorial(count[i]);
            }

        }
        return result;

    }


    public static void main(String[] args) {
        String s = "eye";
        System.out.println(count(s));


    }
}
