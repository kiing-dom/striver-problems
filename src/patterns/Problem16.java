package patterns;

public class Problem16 {
    public static void solve(int n) {
        for (int i = 1; i <= n; i++) {
            char start = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        solve(n);
    }
}
