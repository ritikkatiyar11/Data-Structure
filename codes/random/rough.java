import java.util.HashMap;
import java.util.Map;

public class rough {
    public static int generatePIN(int input1, int input2, int input3) {
        int[] inputs = {input1, input2, input3};
        int[] digitFrequencies = new int[10];

        int maxThousands = -1;
        int minHundreds = 10;
        int maxFrequency = -1;
        int minFrequency = Integer.MAX_VALUE;

        for (int input : inputs) {
            int thousands = input / 1000;
            int hundreds = (input / 100) % 10;
            int tens = (input / 10) % 10;
            int units = input % 10;

            maxThousands = Math.max(maxThousands, thousands);
            minHundreds = Math.min(minHundreds, hundreds);

            digitFrequencies[tens]++;
            digitFrequencies[units]++;

            maxFrequency = Math.max(maxFrequency, digitFrequencies[tens]);
            maxFrequency = Math.max(maxFrequency, digitFrequencies[units]);

            minFrequency = Math.min(minFrequency, digitFrequencies[tens]);
            minFrequency = Math.min(minFrequency, digitFrequencies[units]);
        }

        int tensDigit = -1;
        int unitsDigit = -1;

        for (int i = 0; i < 10; i++) {
            if (digitFrequencies[i] == maxFrequency && i >= tensDigit) {
                tensDigit = i;
            }
            if (digitFrequencies[i] == minFrequency && (unitsDigit == -1 || i <= unitsDigit)) {
                unitsDigit = i;
            }
        }

        return getMaxDigit(input1,input2,input3) * 1000 + getSmallestDigit(input1,input2,input3) * 100 + tensDigit * 10 + unitsDigit;
    }


    public static int getMaxDigit(int num1, int num2, int num3) {
        int maxDigit = Integer.MIN_VALUE;

        maxDigit = Math.max(maxDigit, getMaxDigitInNumber(num1));
        maxDigit = Math.max(maxDigit, getMaxDigitInNumber(num2));
        maxDigit = Math.max(maxDigit, getMaxDigitInNumber(num3));

        return maxDigit;
    }


    public static int getMaxDigitInNumber(int num) {
        int maxDigit = Integer.MIN_VALUE;
        while (num != 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            num /= 10;
        }
        return maxDigit;
    }
    public static int getSmallestDigit(int num1, int num2, int num3) {
        int smallestDigit = Integer.MAX_VALUE;

        smallestDigit = Math.min(smallestDigit, getSmallestDigitInNumber(num1));
        smallestDigit = Math.min(smallestDigit, getSmallestDigitInNumber(num2));
        smallestDigit = Math.min(smallestDigit, getSmallestDigitInNumber(num3));

        return smallestDigit;
    }

    private static int getSmallestDigitInNumber(int num) {
        int smallestDigit = Integer.MAX_VALUE;
        while (num != 0) {
            int digit = num % 10;
            smallestDigit = Math.min(smallestDigit, digit);
            num /= 10;
        }
        return smallestDigit;
    }


    public static void main(String[] args) {
        int input1 = 8530;
        int input2 = 5620;
        int input3 = 7532;

        int result = generatePIN(input1, input2, input3);
        System.out.println(result);
    }
}
