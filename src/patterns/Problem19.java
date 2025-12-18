package patterns;

public class Problem19 {
    public static void solve(int n) {
        for(int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print('*');
            }

            for (int space = 1; space <= (i - 1) * 2; space++) {
                System.out.print(" ");
            }

            for (int k = n; k >= i; k--) {
                System.out.print('*');
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }

            for (int space = 1; space <= (n - i) * 2; space++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
