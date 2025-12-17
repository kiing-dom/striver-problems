package patterns;

class Problem10 {
    /**
     * the goal is to print:
     * Z
     * ZZ
     * ZZZ
     * ZZZZ
     * ZZZZZ
     * ZZZZ
     * zZZ
     * ZZ
     * Z 
     * but the Zs should be asterisks
     */
    public static void solve(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print('*');
            }

            System.out.println("");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1) - 1; j++) {
                System.out.print('*');
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        solve(n);
    }
}