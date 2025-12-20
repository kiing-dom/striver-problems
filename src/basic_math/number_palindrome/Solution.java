package basic_math.number_palindrome;

class Solution {
    /**
     * given an integer N, return true if it's a palindrome, else return false
     * e.g:
     * 121 -> true
     * 123 -> false
     * 
     * 121 %10 = 1
     */
    public static boolean solve(int n) {
        if (n < 0) return false;
        if (n >= 0 && n < 10) return true;

        int extracted = n;
        int current = 0;
        while (extracted != 0) {
            int digit = extracted % 10; 
            current *= 10;
            current += digit;
            extracted /= 10;
        }

        return current == n;
    }

    public static void main(String[] args) {
        System.out.println(solve(121)); // expected: true
        System.out.println(solve(1234)); // expected: false
        System.out.println(solve(1234321)); // expected: true
    }
}