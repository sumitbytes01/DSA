package org.dsa.ArrayHard;

public class PascalTriangleFindNum {
    public static void main(String[] args) {
        // O(col)
        int n = 5, row = 5, col = 3;
        // r-1Cc-1
        int res = 1;
        for (int i = 0; i < col-1; i++) {
            res = (row-1-i)*res;
            res = res/(i+1);
        }
        System.out.println(res);
    }
}
