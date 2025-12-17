package patterns;

public class Problem15 {
    public static void solve(int n) {
        for (int i = 1; i <= n; i++) {
            char start = 'A';
            for (int j = n; j >= i; j--) {
                System.out.print(start++ + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        solve(n);
    }
}
