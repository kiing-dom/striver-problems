package patterns;

public class Problem22 {
    public static void solve(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int topDist = i;
                int leftDist = j;
                int bottomDist = n - i - 1;
                int rightDist = n - j - 1;
                int min = Math.min(
                    Math.min(topDist, bottomDist),
                    Math.min(leftDist, rightDist)
                );
                System.out.print((n - min) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}