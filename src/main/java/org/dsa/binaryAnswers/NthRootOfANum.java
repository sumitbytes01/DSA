package org.dsa.binaryAnswers;

class NthRootOfANum {
    static void main() {
        System.out.println(nthRoot(3, 27));
    }
    public static int nthRoot(int n, int m) {
        for(int i=1; i<=m; i++){
            int ans = 1;
            for(int j = 1;j<=n;j++){
                if (ans > m/i) break; // ✅ just stop inner loop and also stops from being overflow
                ans = ans*i;
            }
            if (ans == m) return i;
        }
    return -1;
    }
}
