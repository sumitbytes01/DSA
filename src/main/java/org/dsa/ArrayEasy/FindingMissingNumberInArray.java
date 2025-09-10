package org.dsa.ArrayEasy;

import java.util.HashSet;
import java.util.Set;

public class FindingMissingNumberInArray {
    public static void main(String[] args) {
        int array[] = {1,2,4,5};
        Set<Integer> set = new HashSet<>();
        for(int num: array){
            set.add(num);
        }
        int n = array.length;
        for (int i = 1; i < n; i++) {
            if(!set.contains(i))
            {
                System.out.println(i);
                break;
            }

        }
    // O(n) no extra space
        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += array[i];
        }
        n = n+1; // coz actual n is = n+1, coz of missing number
        int actualSum = (n*(n+1))/2;
        int res = actualSum-arrSum;
        System.out.println("missing number: "+res);

        // another approach:
        // XOR approach
        n = array.length;
        int xor = 0;
        for (int i = 0; i <n; i++) {
            xor = xor^array[i];
            xor = xor^(i+1);
        }
        xor = xor^(n+1);
        System.out.println(xor);

    }
}
