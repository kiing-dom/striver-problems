package patterns;

public class Problem13 {
    public static void solve(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        solve(n);
    }
}
