package basic_math.reverse_digits_of_a_number;

public class Solution {
    public static int reverseDigits(int n) {
        if (n == 0) return 0;

        int extracted_number = n;
        int currentSum = 0;
        while (extracted_number != 0) {
            if (currentSum > Integer.MAX_VALUE / 10 || currentSum < Integer.MIN_VALUE / 10) {
                return 0;
            }

            int digit = extracted_number % 10;
            currentSum *= 10;
            currentSum += digit;
            extracted_number /= 10;
        }

        return currentSum;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(12345));
    }
}

// 12345
