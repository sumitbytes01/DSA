package org.dsa.ArrayEasy;

public class LargestElementArray {
    public static void main(String[] args) {
        //Time Complexity: O(N*log(N))
        // sort and give n-1 number.
        // O(n)
        int[] arr = {2,5,1,3,0};
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        System.out.println(max);}
}
