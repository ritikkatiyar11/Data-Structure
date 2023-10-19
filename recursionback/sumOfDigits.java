public class sumOfDigits {
    public static int sum(int digit) {
        if (digit <=0) {
            return 0;
        }
        return digit % 10 + sum(digit / 10);
    }

    public static void main(String[] args) {
        System.out.println(sum(1342));
    }


}




