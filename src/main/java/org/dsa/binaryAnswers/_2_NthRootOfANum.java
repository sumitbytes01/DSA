package org.dsa.binaryAnswers;

class _2_NthRootOfANum {
    static void main() {
        System.out.println(nthRootBrute(3, 27));
        System.out.println(nthRootOptimal(3, 27));
    }

    public static int nthRootBrute(int n, int m) {
        for (int i = 1; i <= m; i++) {
            int ans = 1;
            for (int j = 1; j <= n; j++) {
                if (ans > m / i) break; // ✅ just stop inner loop and also stops from being overflow
                ans = ans * i;
            }
            if (ans == m) return i;
        }
        return -1;
    }

    private static int nthRootOptimal(int n, int m) {
        int l = 1;
        int r = m;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int ans = 1;
            for (int i = 1; i <= n; i++) {
                ans = ans * mid;
                if (ans > m)
                    break;
            }
            if (ans == m)
                return mid;
            else if (ans < m)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return-1;
}
}
