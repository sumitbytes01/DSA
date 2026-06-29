package org.dsa.binaryAnswers;

public class SquareRoot {
    static void main() {
        System.out.println(floorSqrt(99));
        System.out.println(floorSqrtOptimal(99));
    }

    // T() - > {root n}
    public static int floorSqrt(int n) {
        if (n == 0 || n == 1) return n;
        int ans = 1;
        for (int i = 1; i <= n / i; i++) { // i >= n/i to avoid overflow.
            ans = i;
        }
        return ans;
    }

    public static int floorSqrtOptimal(int n) {
        if (n == 0 || n == 1) return n;
        int ans = 1;
        int l = 1;
        int r = n;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(mid<=n/mid){
                ans = mid;
                l = mid+1;
            }
            else
                r = mid-1;
        }
        return ans;
    }
}
