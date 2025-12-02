package patterns;

public class Problem9 {
    public static void solve(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);        
    }
}
