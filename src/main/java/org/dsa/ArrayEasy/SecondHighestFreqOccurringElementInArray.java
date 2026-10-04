package org.dsa.ArrayEasy;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestFreqOccurringElementInArray {
    static void main() {
        int[] arr = {7131,7131,7564,3049,3817,956,2059,3452,3466,4087,9866,2622,5499,2761,1946,8131,3103,909,9815,9410,7124,2831,3434,3986,2694,7245,1594,5498,2130,5710,3956,1845,3063,2606,1379,3397};
        int highestFreq = 0;
        int secondHighestFreq = 0;
        int highestFreqElem = Integer.MAX_VALUE;
        int secondHighestFreqElem = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(highestFreq<e.getValue()){
                secondHighestFreq = highestFreq;
                highestFreq = e.getValue();
            }
            else if(highestFreq>e.getValue() && secondHighestFreq < e.getValue()){
                    secondHighestFreq = e.getValue();
                }
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue() == highestFreq){
                highestFreqElem = Math.min(highestFreqElem, e.getKey());
            } else if (e.getValue() == secondHighestFreq) {
                secondHighestFreqElem = Math.min(secondHighestFreqElem, e.getKey());
            }
        }
        System.out.println("Highest Elem: "+highestFreqElem+" with freq:"+highestFreq);
        System.out.println("Second Highest Elem: "+secondHighestFreqElem+" with freq:"+secondHighestFreq);
    }
}
