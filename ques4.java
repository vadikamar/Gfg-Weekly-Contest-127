public class Solution {
    public static void better(long[] x, long y) {
        if (y >= 0 && (x[0] < 0 || x[0] > y)) {
            x[0] = y;
        }
    }

    public static long solution(int[] p, int[] f) {
        int n = f.length;
        int m = n * 2 + 1;
        long[] dp = new long[m];
        for (int i = 0; i < m; i++) {
            dp[i] = -1;
        }
        dp[n] = 0;

        for (int i = 0; i < n; i++) {
            long[] temp = new long[m];
            for (int j = 1; j < m; j++) {
                temp[j - 1] = dp[j];
            }
            for (int j = 0; j < m; j++) {
                if (dp[j] >= 0) {
                    int newIndex = Math.min(j + f[i], m - 1);
                    better(temp, newIndex, dp[j] + p[i]);
                }
            }
            System.arraycopy(temp, 0, dp, 0, m);
        }

        long r = -1;
        for (int i = n; i < m; i++) {
            better(r, dp[i]);
        }
        return r;
    }
    }
}
