package patterns;

/**
 * pattern to return
 * 1
 * 01
 * 101
 * 0101
 * 10101
 */

public class Problem11 {
    public static void solve(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((1 + i + j) % 2);
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
