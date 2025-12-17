package patterns;

public class Problem17 {
    public static void solve(int n) {
        for (int i = 1; i <= n; i++) {
            char start = 'A';
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print((char) (start + j - 1));
            }
            
            for (int k = i - 1; k >= 1; k--) {
                System.out.print((char) (start + k - 1));
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
