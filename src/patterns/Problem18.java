package patterns;

public class Problem18 {
    /**
     * pattern to print:
     * E
     * D E
     * C D E
     * B C D E
     * A B C D E
     */
    public static void solve(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (ch + n - j) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
