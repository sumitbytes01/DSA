package org.dsa.binaryAnswers;

public class _7_KthMissingNumber {
    static void main() {
        int[] vec = {4, 7, 9, 10};
        int k = 1;
        System.out.println(bruteForceMissing(vec, k));
        k = 4;
        System.out.println(bruteForceMissing(vec, k));
        System.out.println(optimumSolutionMissing(vec, k));
    }

    private static int optimumSolutionMissing(int[] vec, int k) {
        int l = 0;
        int r = vec.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            int missing = vec[mid] - (mid +1);// number - index+1
            if(k<=missing){
                r = mid-1;
            }
            else {
                l = mid+1;
            }
        }
        return k+r+1;
    }

    private static int bruteForceMissing(int[] vec, int k) {
        for(int i = 0; i < vec.length; i++) {
            if (k >= vec[i])
                k++;
            else break;
        }
        return k;
    }
}
