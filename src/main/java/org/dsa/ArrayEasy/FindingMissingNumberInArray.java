package org.dsa.ArrayEasy;

import java.util.HashMap;
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
    }
}
