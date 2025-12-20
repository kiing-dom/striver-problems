package basic_math.count_digits_in_a_number;

/**
 * given an integer n, return the number of digits in N
 */
public class Solution {
    public static int solve(int n) {
        if (n == 0) return 1;

        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solve(12345)); // eg. 5
    }
}
