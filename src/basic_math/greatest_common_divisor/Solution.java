package basic_math.greatest_common_divisor;

/**
 * given two integers N1 and N2, find their greatest common divisor
 * 
 * brute force. loop from 1 -> min(n1, n2)
 * try to find the max number that divides into both
 */
public class Solution {
    public static int solveBrute(int n1, int n2) {
        int min = Math.min(n1, n2);
        int gcd = 1;
        for (int divisor = 1; divisor <= min; divisor++) {
            if (n1 % divisor == 0 && n2 % divisor == 0) {
                gcd = divisor;
            }
        }

        return gcd;
    }

    public static int solveImproved(int n1, int n2) {
        int min = Math.min(n1, n2);
        int gcd = 1;
        for (int i = min; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }

        return gcd;
    }

    public static int solveOptimal(int n1, int n2) {
        return gcdRecursive(n1, n2);
    }

    private static int gcdRecursive(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        return gcdRecursive(Math.abs(b), Math.abs(a % b));
    }

    public static void main(String[] args) {
        System.out.println(solveBrute(20, 15)); // expected: 5
        System.out.println(solveOptimal(20, 15));
    }
}
